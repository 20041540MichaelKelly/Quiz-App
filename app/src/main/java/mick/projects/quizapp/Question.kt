package mick.projects.quizapp

data class Question(
    val id: Int,
    val question: String,
    var Image: Int,
    var questionOne: String,
    var questionTwo: String,
    var questionThree: String,
    var questionFour: String,
    var correctAns: Int
)
