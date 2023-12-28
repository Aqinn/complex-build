import java.util.Date
import java.text.SimpleDateFormat

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.aqinn.demo.complexbuild.lb"
    compileSdk = 33
    buildToolsVersion = "30.0.3"

    defaultConfig {
        minSdk = 24
        targetSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    sourceSets {
        getByName("main") {
            java {
                srcDir("src/main/kotlin")
                srcDir("src/main/java")
            }
        }
    }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
}

afterEvaluate {

    val sourceJarTask = project.tasks.create("sourceJar", org.gradle.jvm.tasks.Jar::class.java).apply {
        val sourceSets = (project.extensions.findByName("android") as? com.android.build.gradle.AndroidConfig)?.sourceSets
        from(sourceSets?.findByName("main")?.java?.srcDirs)
        classifier = "sources"
    }
    val mvnGroupId = "com.aqinn"
    val mvnArtifactId = "l_b"
    publishing {
        val gitRepoPath = "${rootDir}"
        println("[info] gitRepoPath:${gitRepoPath}")
        fun timestamp(): String {
            try {
                return SimpleDateFormat("yyyyMMddHHmmss").format(Date())
            } catch (e: Exception) {

            }
            return "null"
        }
        fun parsePbGitCommit(): String {
            try {
                val process = Runtime.getRuntime().exec("git -C $gitRepoPath rev-parse HEAD")
                val result = org.codehaus.groovy.runtime.ProcessGroovyMethods.getText(process).trim()
                println("[warning] parsePbGitCommit result: ${result}")
                if (result.length < 7) {
                    println("[warning] invalid commit")
                    return "null"
                }
                return result
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return "null"
        }
        val pbCommit = parsePbGitCommit()
        val versions = hashMapOf<String, String>().apply {
            put("develop", "${timestamp()}-${pbCommit.take(8)}-SNAPSHOT")
            put("release", "${timestamp()}-${pbCommit.take(8)}")
        }
        println("versions[develop]: ${versions["develop"]}")
        println("versions[release]: ${versions["release"]}")



        // 配置maven 仓库
        repositories {
            maven {
                name = "Develop"
                isAllowInsecureProtocol = true
                url = uri("$rootDir/maven_for_allan")
            }
        }

        // 配置发布产物
        publications {
            create("Develop", MavenPublication::class.java).apply {
                from(components["debug"])
                artifact(sourceJarTask)
                groupId = mvnGroupId
                artifactId = mvnArtifactId
                version = versions["develop"]
            }
        }
    }
}