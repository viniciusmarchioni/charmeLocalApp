package com.example.charmelocal.initial

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.charmelocal.CartActivity
import com.example.charmelocal.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var homeFragment: HomeFragment
    private lateinit var searchFragment: SearchFragment
    private lateinit var accountFragment: AccountFragment
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var titleText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = getColor(R.color.black)
        window.navigationBarColor = getColor(R.color.white)

        homeFragment = HomeFragment()
        searchFragment = SearchFragment()
        accountFragment = AccountFragment()
        val cartButton = findViewById<ImageButton>(R.id.CartButtom)
        titleText = findViewById(R.id.openText)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)

        cartButton.setOnClickListener {
            goToNewLayout(CartActivity())
        }

        setFragment(homeFragment)
    }

    private fun setFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

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

    private fun goToNewLayout(page: AppCompatActivity) {
        val newLayout = Intent(this, page::class.java)
        startActivity(newLayout)
    }
}
