plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    id("test-script-plugin")
    id("com.aqinn.demo.agp.plugin.testktplugin")
}

android {
    namespace = "com.aqinn.demo.complexbuild"
    compileSdk = 33
//    compileSdkPreview = "UpsideDownCake"

    defaultConfig {
        applicationId = "com.aqinn.demo.complexbuild"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary = true
//        }
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
    buildFeatures {
//        compose = true
    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.3.2"
//    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

//configurations.implementation.configure {
//    isCanBeResolved = true
//}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    androidTestImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
    androidTestImplementation("androidx.test:runner:1.5.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")

    implementation(project(":module:m_a"))
//    {
//        exclude("com.aqinn", "l_b")
//    }
//    implementation("com.aqinn:l_b:20231225214756-4ac670d0-SNAPSHOT")  // version 0
    implementation("com.aqinn:l_b:20231225215157-4ac670d0-SNAPSHOT")  // version 1
//    implementation(project(mapOf("path" to ":library:l_b")))
}

testKt {
    arg1 = 111
    arg1 = 222
    arg2 = 333F
    arg3 = "test string"
    arg4 = intArrayOf(1, 2, 3, 4, 5)
    arg5 = listOf("123", "456", "789", "0")
}