plugins {
    id("com.android.application")    version "3.2.1"  apply false
    id("com.android.library")        version "3.2.1"  apply false
    kotlin("android")            version "1.2.71" apply false
    kotlin("android.extensions") version "1.2.71" apply false
}

subprojects {
    repositories {
        google()
        jcenter()
    }
    configurations.all {
        resolutionStrategy {
            eachDependency {
                when (requested.group) {
                    "com.google.code.findbugs" -> when (requested.name) {
                        "jsr305" -> useVersion("3.0.2")
                        "annotation" -> useTarget("com.google.code.findbugs:jsr305:3.0.2")
                    }
                }
            }
        }
    }
}
