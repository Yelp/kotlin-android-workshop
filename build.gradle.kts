plugins {
    id("com.android.application") version "3.1.2" apply false
    id("com.android.library") version "3.1.2" apply false
    kotlin("android") version "1.2.41" apply false
}

subprojects {
    repositories {
        google()
        jcenter()
    }
    configurations.all {
        resolutionStrategy {
            eachDependency {
                if (requested.group != "com.google.code.findbugs") return@eachDependency

                when (requested.name) {
                    "jsr305" -> useVersion("3.0.2")
                    "annotation" -> useTarget("com.google.code.findbugs:jsr305:3.0.2")
                }
            }
        }
    }
}
