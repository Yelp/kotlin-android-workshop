package my.demo.app1

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import my.demo.app3.MainActivity
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun whenStarted_showsHelloWorld() {
        onView(withId(R.id.hiWorld)).check(matches(withText(R.string.greeting)))
    }
}