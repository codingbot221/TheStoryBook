package com.example.myapplication1000

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)


        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, CleverFish::class.java)
            startActivity(intent)
        }


        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, TwoFrogs::class.java)
            startActivity(intent)
        }


        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, HonestyPolicy::class.java)
            startActivity(intent)
        }


        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, CleverRooster::class.java)
            startActivity(intent)
        }


        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
                val url=Uri.parse("https://www.firstcry.com/intelli/articles/tag/moral-stories-for-kids/?srsltid=AfmBOorAch9joGWCXJis4D5zNZ4m4iAap1jUZxrHScOhpNKIaBdYBLbq")
                val i = Intent(Intent.ACTION_VIEW)
                i.setData(url)
                startActivity(i)
            }
        }

    }




