package com.example.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomnav: BottomNavigationView = findViewById(R.id.bottom_nav)
        openFragment(MyFirstFragments())

        bottomnav.setOnNavigationItemSelectedListener {
            val id = it.itemId
            when(id){
                R.id.menu_home -> {
                    Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show()
                    openFragment(MyFirstFragments())
                }
                R.id.menu_profile -> {
                    Toast.makeText(this, "Profile Selected", Toast.LENGTH_SHORT).show()
                    openFragment(MySecondFragment())
                }
                R.id.menu_cart -> {
                    Toast.makeText(this, "Cart Selected", Toast.LENGTH_SHORT).show()
                    openFragment(MyThirdFragment())
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
//
//        supportFragmentManager.beginTransaction().replace(R.id.fcv, MyFirstFragments()).commit()


        }
    private fun openFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fcv, fragment).commit()
    }
    }