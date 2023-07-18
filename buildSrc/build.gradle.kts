plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins.register("testktpluginname") {
        id = "com.aqinn.demo.agp.plugin.testktplugin"
        implementationClass = "com.aqinn.demo.agp.plugin.TestKtPlugin"
    }
}

repositories {
    mavenCentral()
    google()
//    gradlePluginPortal()
}

dependencies {
//    implementation(gradleApi())
//    implementation(kotlin("stdlib-jdk8"))
    implementation("com.android.tools.build:gradle:4.2.2")
}

//gradle.addProjectEvaluationListener(object : ProjectEvaluationListener {
//    override fun beforeEvaluate(target: Project) {
//    }
//
//    override fun afterEvaluate(target: Project, state: ProjectState) {
//        target.plugins.findPlugin("com.android.application") ?: target.plugins.findPlugin("com.android.library") ?: return
//        target.configProject()
//    }
//
//    private fun Project.configProject() {
//        android {
//            compileOptions {
//                sourceCompatibility = JavaVersion.VERSION_17
//                targetCompatibility = JavaVersion.VERSION_17
//            }
//        }
//    }
//})