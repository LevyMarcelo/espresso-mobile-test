package br.com.espresso.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import br.com.espresso.MainActivity
import br.com.espresso.screens.PersonalDataScreen
import org.junit.runner.RunWith
import org.junit.Rule
import org.junit.Test

@RunWith(AndroidJUnit4::class)
class PersonalDataTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    private val personalDataScreen = PersonalDataScreen()

    @Test
    fun personalDataTest() {
        personalDataScreen.fillCpfField("443.388.000-03")
        personalDataScreen.fillFullNameField("Levy Cunha")
        personalDataScreen.whatIsSocialName("O que é um nome social?")
        personalDataScreen.buttonValidationContinue("Continuar")
    }

}
