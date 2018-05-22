include(":app",
        ":app1",
        ":app2",
        ":common")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    resolutionStrategy {
        eachPlugin {
            if ("com.android" in requested.id.id) {
                useModule("com.android.tools.build:gradle:${requested.version}")
            }
        }
    }
}