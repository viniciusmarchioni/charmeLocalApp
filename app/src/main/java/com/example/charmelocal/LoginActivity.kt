package com.example.charmelocal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonCadClient = findViewById<Button>(R.id.cadClient)
        val buttonCadSeller = findViewById<Button>(R.id.cadSeller)
        val buttonLogin = findViewById<Button>(R.id.singIn)

        buttonCadClient.setOnClickListener {
            goToNewLayout(RegisterCustomerActivity())
        }
        buttonCadSeller.setOnClickListener {
            goToNewLayout(RegisterStoreActivity())
        }
        buttonLogin.setOnClickListener {
            goToNewLayout(LoginActivity())
        }
    }


    private fun goToNewLayout(page:AppCompatActivity){
        val newLayout = Intent(this,page::class.java)
        startActivity(newLayout)
    }
}