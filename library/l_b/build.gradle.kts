plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
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
