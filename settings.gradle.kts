//enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when (requested.id.namespace) {
                "com.android" ->
                    useModule("com.android.tools.build:gradle:7.2.2")
            }
        }
    }
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "complex-build"
include(":app")
include(":module:m_a")
include(":module:m_b")
include(":library:l_a")
include(":library:l_b")
include(":library:l_delegate")