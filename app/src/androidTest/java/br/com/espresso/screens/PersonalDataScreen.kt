package br.com.espresso.screens

import androidx.test.espresso.Espresso.closeSoftKeyboard
import br.com.espresso.R
import br.com.espresso.utils.Utils

class PersonalDataScreen : Utils() {

    private val cpfField = R.id.edt_cpf_personal_data
    private val fullNameField = R.id.edt_fullname_personal_data
    private val whatIsSocialNameButton = R.id.btn_help_nickname
    private val okUnderstoodButton = R.id.help_nickname_btn_ok

    fun fillCpfField(value: String) {
        write(cpfField, value)
    }

    fun fillFullNameField(value: String) {
        write(fullNameField, value)
    }

    fun whatIsSocialName(element: String) {
        closeSoftKeyboard()
        click(whatIsSocialNameButton)
        textValidation(element)
        click(okUnderstoodButton)
    }

    fun buttonValidationContinue(element: String) {
        textValidation(element)
    }

}
