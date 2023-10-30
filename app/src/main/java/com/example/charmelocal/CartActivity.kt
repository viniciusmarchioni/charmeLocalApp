package com.example.charmelocal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cartbutton = findViewById<ImageButton>(R.id.backButtom)
        window.statusBarColor = getColor(R.color.black)
        window.navigationBarColor = getColor(R.color.white);
        cartbutton.setOnClickListener{
            goToSecoundLayout()
        }

    }


    private fun goToSecoundLayout(){
        val secoundLayout = Intent(this,MainActivity::class.java)
        startActivity(secoundLayout)
    }
}