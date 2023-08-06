package com.example.routeapp

import CustomAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_fragement)


        val data = ArrayList<itemViewModel>()
        data.add(itemViewModel(R.drawable.ios, "كورس برمجة IOS","120 hrs"))
        data.add(itemViewModel(R.drawable.android, "كورس برمجة الاندرويد ","220 hrs"))
        data.add(itemViewModel(R.drawable.full, "كورس Full Stack ","360 hrs"))

        val recyclerview = findViewById<RecyclerView>(R.id.coursesRv1)
        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter
        val currentbtn = findViewById<CardView>(R.id.currentCourse)
        currentbtn.setOnClickListener {
            Intent(this,AndroidCourse::class.java).also {
                startActivity(it)
            }
        }

    }
}