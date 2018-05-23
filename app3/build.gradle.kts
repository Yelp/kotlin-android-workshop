plugins { id("com.android.application") }
apply { from("$rootDir/app.gradle") }

android {
    defaultConfig {
        applicationId = "my.demo.app3"
    }
}
