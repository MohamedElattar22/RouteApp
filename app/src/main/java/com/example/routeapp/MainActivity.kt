package com.example.routeapp

import CustomAdapter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val  nxtbtn = findViewById<Button>(R.id.nxtbtn)
        val skipbtn = findViewById<TextView>(R.id.skipbtn)
        val fFragment = BlankFragment()
        val secFragement = secondfragement()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.onboardingFrag,fFragment)
            commit()
        }
        nxtbtn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.onboardingFrag,secFragement)
                addToBackStack("da")
                commit()
            }
        }
        skipbtn.setOnClickListener {
            Intent(this,HomeActivity::class.java).also {
                startActivity(it)
            }
        }









    }
}