plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    id("test-script-plugin")
//    id("com.aqinn.demo.agp.plugin.testktplugin")
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
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
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

dependencies {
    androidTestImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
    androidTestImplementation("androidx.test:runner:1.5.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")

    implementation(project(":library:l_ui_base"))
    implementation(project(":module:m_a"))
    implementation(project(":module:m_test"))
}

//testKt {
//    arg1 = 111
//    arg1 = 222
//    arg2 = 333F
//    arg3 = "test string"
//    arg4 = intArrayOf(1, 2, 3, 4, 5)
//    arg5 = listOf("123", "456", "789", "0")
//}