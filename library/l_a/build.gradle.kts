plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.aqinn.demo.complexbuild.ldelegate"
    compileSdk = 33
    buildToolsVersion = "30.0.3"

    defaultConfig {
        minSdk = 24
        targetSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
//    implementation(project(":library:l_b"))
    implementation("com.aqinn:l_b:20231225214756-4ac670d0-SNAPSHOT")  // version 0
//    implementation("com.aqinn:l_b:20231225215157-4ac670d0-SNAPSHOT")  // version 1
}

