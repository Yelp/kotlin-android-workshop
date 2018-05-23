package my.demo.app3

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.pressImeActionButton
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withHint
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun whenStarted_showsHelloWorld() {
        onView(withId(R.id.hiWorld)).check(matches(withText(R.string.greeting)))
    }

    @Test
    fun whenSearching_showsQuery() {
        onView(withHint(R.string.query_hint))
                .perform(typeText("Restaurant"))
                .perform(pressImeActionButton())
        onView(withId(R.id.hiWorld)).check(matches(withText("Restaurant")))
    }
}