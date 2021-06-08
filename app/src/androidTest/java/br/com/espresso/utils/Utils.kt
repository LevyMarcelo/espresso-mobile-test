package br.com.espresso.utils

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches

open class Utils {

    fun write(element: Int, value: String) {
        onView(withId(element)).perform(typeText(value))
    }

    fun click(element: Int) {
        onView(withId(element)).perform(click())
    }

    fun textValidation(element: String) {
        onView(withText(element)).check(matches(isDisplayed()))
    }

}
