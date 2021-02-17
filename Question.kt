package com.example.seniorprojectkotlin

class Question{
    private var question: String
    private var correct: String
    private var lessonCode: Int
    private var options: Array<String>

    constructor(quest: String, ans: String, lessCode: Int, answers: Array<String>){
        this.question = quest
        this.correct = ans
        this.lessonCode = lessCode
        this.options = answers
    }

    fun getQuestion(): String{
        return this.question
    }

    fun getOptions(): Array<String>{
        return this.options
    }

    fun getCorrect(): String{
        return this.correct
    }

    fun grade(response: String): Boolean{
        if((this.correct).equals(response)){
            return true
        }
        return false
    }
}