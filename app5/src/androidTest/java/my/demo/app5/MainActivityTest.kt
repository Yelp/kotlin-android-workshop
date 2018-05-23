package my.demo.app5

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.pressImeActionButton
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withHint
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import io.reactivex.Single
import my.demo.app5.model.Business
import my.demo.app5.model.BusinessRepo
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExternalResource
import org.junit.rules.RuleChain
import org.mockito.ArgumentMatchers.anyString

class MainActivityTest {

    val testBusiness = Business("Test Works!", "")
    @get:Rule val activityRule = RuleChain.emptyRuleChain()
            .around(object : ExternalResource() {
                override fun before() {
                    BusinessRepo.mock = mock {
                        on { search(anyString()) } doReturn Single.just(listOf(testBusiness))
                    }
                }

                override fun after() {
                    BusinessRepo.mock = null
                }
            })
            .around(ActivityTestRule(MainActivity::class.java))

    @Test
    fun whenStarted_showsHelloWorld() {
        onView(withId(R.id.hiWorld)).check(matches(withText(R.string.greeting)))
    }

    @Test
    fun whenSearching_showsFirstResult() {
        onView(withHint(R.string.query_hint))
                .perform(typeText("Restaurant"))
                .perform(pressImeActionButton())
        onView(withId(R.id.hiWorld)).check(matches(withText(testBusiness.name)))
    }
}