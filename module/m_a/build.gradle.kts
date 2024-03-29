plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.aqinn.demo.complexbuild.ma"
    compileSdk = 33
    buildToolsVersion = "30.0.3"

    defaultConfig {
        minSdk = 24
        targetSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(project(":library:l_ui_base"))
    implementation(project(":module:m_b"))
    compileOnly(project(":library:l_delegate"))
}