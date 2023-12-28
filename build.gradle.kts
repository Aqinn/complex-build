// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    id("com.android.application") version "7.2.2" apply false
//    id("com.android.library") version "7.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}

gradle.projectsEvaluated {
    println("输出所有项目start")
    allprojects {
//        if (subprojects.isEmpty()) {
//            println(name)
//            println(displayName)
//            println(path)
//            println(version)
//            println(buildFile.absolutePath)
//        }

        configurations.all {
            isCanBeResolved = true

            resolutionStrategy {
                preferProjectModules()
            }
        }
    }
    println("输出所有项目end")
}