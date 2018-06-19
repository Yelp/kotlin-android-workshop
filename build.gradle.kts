plugins {
    id("com.android.application") version "3.1.3" apply false
    id("com.android.library") version "3.1.3" apply false
    kotlin("android") version "1.2.50" apply false
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
                    "com.android.support" -> useVersion("27.1.1")
                    "com.google.code.findbugs" -> when (requested.name) {
                        "jsr305" -> useVersion("3.0.2")
                        "annotation" -> useTarget("com.google.code.findbugs:jsr305:3.0.2")
                    }
                }
            }
        }
    }
}
