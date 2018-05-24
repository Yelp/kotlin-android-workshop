plugins { id("com.android.library") }
apply { from("$rootDir/lib.gradle") }

dependencies {
    implementation("com.yelp.android.apis:bizapp:1.20180518114341.0")
}