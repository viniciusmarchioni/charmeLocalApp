package com.example.charmelocal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    //Fragmentos de navegação
    private lateinit var homeFragment: homeFragment
    private lateinit var searchFragment: searchFragment
    private lateinit var accountFragment: accountFragment
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var titleText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = getColor(R.color.black)
        window.navigationBarColor = getColor(R.color.white)

        //Instanciando fragmentos
        homeFragment = homeFragment()
        searchFragment = searchFragment()
        accountFragment = accountFragment()


        val cartbutton = findViewById<ImageButton>(R.id.CartButtom)
        titleText = findViewById<TextView>(R.id.openText)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)


        cartbutton.setOnClickListener{
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
    @SuppressLint("SetTextI18n")
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.home -> {
                setFragment(homeFragment)
                titleText.text = "Home"
            }

            R.id.search -> {
                setFragment(searchFragment)
                titleText.text = "Search"
            }

            R.id.account -> {
                setFragment(accountFragment)
                titleText.text = "Account"
            }
        }
        return true
    }

    private fun goToSecoundLayout(){
        val secoundLayout = Intent(this,CartActivity::class.java)
        startActivity(secoundLayout)
    }

}