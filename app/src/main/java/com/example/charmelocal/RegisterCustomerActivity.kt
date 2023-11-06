package com.example.charmelocal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class RegisterCustomerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_customer)

        val buttonBack = findViewById<ImageButton>(R.id.backButtom)
        val buttonSingIn = findViewById<Button>(R.id.singUpButton)

        buttonSingIn.setOnClickListener {
            val cpf = findViewById<EditText>(R.id.editCpf)
            val name = findViewById<EditText>(R.id.editName)
            val cellphone = findViewById<EditText>(R.id.editCellPhone)
            val email = findViewById<EditText>(R.id.editEmail)
            val password = findViewById<EditText>(R.id.editPassword)

            if (checkValues(cpf, name, cellphone, email, password)) {
                goToNewLayout(LoginActivity())
            }
        }

        buttonBack.setOnClickListener {
            goToNewLayout(ChoiceActivity())
        }

    }

    private fun checkValues(vararg value: EditText): Boolean {
        for (i in value) {
            if (i.text == null || i.text.toString() == "") {
                i.setBackgroundColor(LoginActivity().red)
                return false
            } else if (i.id == R.id.editCpf && i.text.length < 10) {
                i.setBackgroundColor(LoginActivity().red)
                return false
            }
        }
        return true
    }

    private fun goToNewLayout(page: AppCompatActivity) {
        val newLayout = Intent(this, page::class.java)
        startActivity(newLayout)
    }
}