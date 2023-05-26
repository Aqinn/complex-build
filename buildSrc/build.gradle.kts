plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
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