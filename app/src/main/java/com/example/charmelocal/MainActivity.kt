package com.example.charmelocal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.MenuItem
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    //Fragmentos de navegação
    private lateinit var homeFragment: homeFragment
    private lateinit var searchFragment: searchFragment
    private lateinit var accountFragment: accountFragment
    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Instanciando fragmentos
        homeFragment = homeFragment()
        searchFragment = searchFragment()
        accountFragment = accountFragment()
        val Cartbutton = findViewById<ImageButton>(R.id.CartButtom)
        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)


        Cartbutton.setOnClickListener{
            goToSecoundLayout()
        }

        setFragment(homeFragment)
    }

    //função para chamar fragmentos
    private fun setFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, fragment)
        fragmentTransaction.commit()
    }

    //função que verifica fragmentos selecionados
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.home -> {
                setFragment(homeFragment)
            }

            R.id.search -> {
                setFragment(searchFragment)
            }

            R.id.account -> {
                setFragment(accountFragment)
            }
        }
        return true
    }

    private fun goToSecoundLayout(){
        val secoundLayout = Intent(this,CartActivity::class.java)
        startActivity(secoundLayout)
    }

}