package com.example.seniorprojectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lesson1button: Button = findViewById(R.id.button1)
        lesson1button.setOnClickListener{
            val intent = Intent(this, Lesson1Activity::class.java)
            startActivity(intent)
        }
         val lesson2button: Button = findViewById(R.id.button2)
        lesson2button.setOnClickListener {
            val intent = Intent(this, Lesson2Activity::class.java)
            startActivity(intent)
        }
        val lesson3button: Button = findViewById(R.id.button3)
        lesson3button.setOnClickListener {
            val intent = Intent(this, Lesson3Activity::class.java)
            startActivity(intent)
        }
        val lesson4Button: Button = findViewById(R.id.button4)
        lesson4Button.setOnClickListener {
            val intent: Intent = Intent(this, Lesson4Activity::class.java)
            startActivity(intent)
        }
    }
}
