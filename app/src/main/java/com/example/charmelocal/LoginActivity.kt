package com.example.charmelocal

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.example.charmelocal.initial.MainActivity

class LoginActivity : AppCompatActivity() {

    private var cpfCorrect: String = "47386011806"
    private var passwordCorrect: String = "12345678"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val red = Color.parseColor("#DD6F6F")
        val cpf = findViewById<EditText>(R.id.editCpf)
        val password = findViewById<EditText>(R.id.editPassword)
        val singInButton = findViewById<Button>(R.id.singInButton)
        val backButton = findViewById<ImageButton>(R.id.backButtom)

        backButton.setOnClickListener {
            goToNewLayout(ChoiceActivity())
        }


        singInButton.setOnClickListener {
            if (cpf.text.toString() != cpfCorrect) {
                cpf.setBackgroundColor(red)
            } 
            else if (password.text.toString() != passwordCorrect) {
                password.setBackgroundColor(red)
            } else {
                goToNewLayout(MainActivity())
            }
        }
    }

    private fun goToNewLayout(page: AppCompatActivity) {
        val newLayout = Intent(this, page::class.java)
        startActivity(newLayout)
    }

}