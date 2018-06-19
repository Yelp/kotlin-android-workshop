plugins {
    id("com.android.library")
}
project.ext["isApp"] = false
apply(from = "$rootDir/common.gradle")

dependencies {
    implementation("com.squareup.retrofit2:converter-moshi:2.4.0")
}