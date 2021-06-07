package br.com.espresso.utils

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.*

open class Utils {

    fun write(element: Int, value: String) {
        onView(withId(element)).perform(typeText(value))
    }

    fun click(element: Int) {
        onView(withId(element)).perform(ViewActions.click())
    }

    fun textValidation(element: String) {
        onView(withText(element)).check(ViewAssertions.matches(isDisplayed()))
    }

}
