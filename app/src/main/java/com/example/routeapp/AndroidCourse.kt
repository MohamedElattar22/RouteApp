package com.example.routeapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AndroidCourse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_course)
        val backbtn = findViewById<ImageView>(R.id.backToHomeBtn)
        backbtn.setOnClickListener {
            finish()
        }

    }
}