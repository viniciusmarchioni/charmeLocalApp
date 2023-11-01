package com.example.charmelocal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class RegisterCustomerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_customer)

        val buttonBack = findViewById<ImageButton>(R.id.backButtom)

        buttonBack.setOnClickListener{
            goToNewLayout(LoginActivity())
        }

    }

    private fun goToNewLayout(page:AppCompatActivity){
        val newLayout = Intent(this,page::class.java)
        startActivity(newLayout)
    }
}