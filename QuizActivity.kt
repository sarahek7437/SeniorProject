package com.example.seniorprojectkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuizActivity : AppCompatActivity() {
//    constructor(quest: String, ans: String, lessCode: Int, answers: Array<String>){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val ans: Array<String> = arrayOf("Merci", "S'il te plait", "Oui", "Savoir")
        val q1 = Question("Which of these means 'Please'?", "S'il te plait", 1, ans)

        val ans2: Array<String> = arrayOf("Je sais", "Non", "S'il vous plait", "De rien")
        val q2 = Question("Which of these means 'You're welcome'?", "De rien", 1, ans2)

        val putQ: TextView = findViewById(R.id.quiz_question)
        val a: Button = findViewById(R.id.answer1)
        val b: Button = findViewById(R.id.answer2)
        val c: Button = findViewById(R.id.answer3)
        val d: Button = findViewById(R.id.answer4)
        val prev: Button = findViewById(R.id.previous)
        val next: Button = findViewById(R.id.next)

        var curQ = 0

        val quiz_array: Array<Question> = arrayOf(q1, q2)

        fun displayQuestion(q:Question){
            val answers:Array<String> = q.getOptions()
            putQ.setText(q.getQuestion())
            a.setText(answers[0])
            b.setText(answers[1])
            c.setText(answers[2])
            d.setText(answers[3])
        }

        displayQuestion(quiz_array[0])

        a.setOnClickListener {
            val response: String = a.getText().toString()
            val userAns: Boolean = quiz_array[curQ].grade(response)
            if(userAns == true){
                a.setBackgroundResource(R.drawable.button_correct)
            }
            else a.setBackgroundResource(R.drawable.button_incorrect)
        }

        b.setOnClickListener {
            val response: String = b.getText().toString()
            val userAns: Boolean = quiz_array[curQ].grade(response)
            if(userAns == true){
                b.setBackgroundResource(R.drawable.button_correct)
            }
            else b.setBackgroundResource(R.drawable.button_incorrect)
        }

        c.setOnClickListener {
            val response: String = c.getText().toString()
            val userAns: Boolean = quiz_array[curQ].grade(response)
            if(userAns == true){
                c.setBackgroundResource(R.drawable.button_correct)
            }
            else c.setBackgroundResource(R.drawable.button_incorrect)
        }

        d.setOnClickListener {
            val response: String = d.getText().toString()
            val userAns: Boolean = quiz_array[curQ].grade(response)
            if(userAns == true){
                d.setBackgroundResource(R.drawable.button_correct)
            }
            else d.setBackgroundResource(R.drawable.button_incorrect)
        }

        prev.setOnClickListener {
            if(curQ > 0){
                curQ = curQ - 1
                displayQuestion(quiz_array[curQ])
            }
        }

        next.setOnClickListener {
            if(curQ < quiz_array.size){
                curQ = curQ + 1
                displayQuestion(quiz_array[curQ])
            }
            
        }
    }
}
