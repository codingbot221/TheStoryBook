package com.example.myapplication1000

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



//package com.example.yourapp
//
//import android.content.Intent
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_empty_view.*

class Horror1 : AppCompatActivity() {

    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horror1)

        button1.setOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

//        button2.setOnClickListener {
//            val intent = Intent(this, Activity2::class.java)
//            startActivity(intent)
//        }
//
//        button3.setOnClickListener {
//            val intent = Intent(this, Activity3::class.java)
//            startActivity(intent)
//        }
//
//        button4.setOnClickListener {
//            val intent = Intent(this, Activity4::class.java)
//            startActivity(intent)
//        }
    }
}
