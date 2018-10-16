plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

apply(from = "$rootDir/common.gradle")

dependencies {
    implementation(project(":common"))
}
