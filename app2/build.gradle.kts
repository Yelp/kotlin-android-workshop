plugins { id("com.android.application") }
apply { from("../app.gradle") }

android {
    defaultConfig {
        applicationId = "my.demo.app2"
    }
}
