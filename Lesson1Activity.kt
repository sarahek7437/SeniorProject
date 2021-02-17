package com.example.seniorprojectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Lesson1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1)

        val takeQuiz: Button = findViewById(R.id.take_quiz1)
        takeQuiz.setOnClickListener {
            val intent: Intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}
