package my.demo.app3

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.pressImeActionButton
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun whenStarted_showsHelloWorld() {
        onView(withText(R.string.greeting)).check(matches(isDisplayed()))
    }

    @Test
    fun whenSearching_showsQuery() {
        onView(withHint(R.string.query_hint))
                .perform(typeText("Restaurant"))
                .perform(pressImeActionButton())
        onView(withId(R.id.hiWorld)).check(matches(withText("Restaurant")))
    }
}
