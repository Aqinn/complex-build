plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.aqinn.demo.complexbuild.luibase"
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
    api("androidx.core:core-ktx:1.6.0")
    api("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")
    api("androidx.appcompat:appcompat:1.2.0")
    // 不要用以下最新版本号，否则会报错kotlin版本不支持
//    api("androidx.core:core-ktx:1.10.1")
//    api("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
//    api("androidx.appcompat:appcompat:1.6.1")
}
