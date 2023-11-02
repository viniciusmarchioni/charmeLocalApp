package com.example.charmelocal

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.example.charmelocal.initial.MainActivity

class RegisterStoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_store)
        val buttonBack = findViewById<ImageButton>(R.id.backButtom)
        val buttonSingIn = findViewById<Button>(R.id.singUpButton)


        buttonSingIn.setOnClickListener {
            val cnpj = findViewById<EditText>(R.id.editCnpj)
            val name = findViewById<EditText>(R.id.editName)
            val cellphone = findViewById<EditText>(R.id.editCellPhone)
            val email = findViewById<EditText>(R.id.editEmail)
            val password = findViewById<EditText>(R.id.editPassword)

            if(checkValues(cnpj,name,cellphone,email,password)){
                goToNewLayout(MainActivity())
            }
        }

        buttonBack.setOnClickListener{
            goToNewLayout(LoginActivity())
        }

    }


    private fun checkValues(vararg value: EditText): Boolean{
        val red = Color.parseColor("#DD6F6F")
        for(i in value){
            if(i.text == null || i.text.toString() == ""){
                i.setBackgroundColor(red)
                return false
            }
            else if(i.id == R.id.editCpf && i.text.length < 10){
                i.setBackgroundColor(red)
                return false
            }
        }
        return true
    }

    private fun goToNewLayout(page:AppCompatActivity){
        val newLayout = Intent(this,page::class.java)
        startActivity(newLayout)
    }
}