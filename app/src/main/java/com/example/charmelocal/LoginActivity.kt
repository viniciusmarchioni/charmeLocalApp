package com.example.charmelocal

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.charmelocal.initial.MainActivity

class LoginActivity : AppCompatActivity() {

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
            goToNewLayout(MainActivity())
        }
    }

    data class person(var cpf:String,var nome:String,var email:String,var password:String)
    private fun goToNewLayout(page: AppCompatActivity) {
        val newLayout = Intent(this, page::class.java)
        startActivity(newLayout)
    }

}