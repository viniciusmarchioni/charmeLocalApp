package com.example.charmelocal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.charmelocal.initial.MainActivity

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cartButton = findViewById<ImageButton>(R.id.backButtom)
        window.statusBarColor = getColor(R.color.black)
        window.navigationBarColor = getColor(R.color.white)
        cartButton.setOnClickListener {
            goToNewLayout(MainActivity())
        }
    }


    private fun goToNewLayout(page: AppCompatActivity) {
        val newLayout = Intent(this, page::class.java)
        startActivity(newLayout)
    }
}