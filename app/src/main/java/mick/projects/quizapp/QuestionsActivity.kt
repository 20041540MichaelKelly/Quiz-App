package mick.projects.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition: Int = 1
    private var progressBar: ProgressBar?= null
    private var tvProgressBar: TextView?= null
    private var imageView: ImageView?= null
    private var tvQuestion: TextView?= null

    private var answerOne: TextView?= null
    private var answerTwo: TextView?= null
    private var answerThree: TextView?= null
    private var answerFour: TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qustions)

        progressBar = findViewById(R.id.progressBar)
        tvProgressBar = findViewById(R.id.tv_prog)
        tvQuestion = findViewById(R.id.tv_question)
        answerOne = findViewById(R.id.anwserOne)
        answerTwo = findViewById(R.id.anwserTwo)
        answerThree = findViewById(R.id.anwserThree)
        answerFour = findViewById(R.id.anwserFour)

        var questionList = Constants.getQuestions()

        for(i in questionList) {
            Log.e("Question", i.question)
        }

        var currentPosition = 1
        val question: Question = questionList[currentPosition -1]
        progressBar?.progress = currentPosition
        tvProgressBar?.text = "$currentPosition/ ${progressBar?.max}"
        tvQuestion?.text = question.question
        answerOne?.text = question.questionOne
        answerTwo?.text = question.questionTwo
        answerThree?.text = question.questionThree
        answerFour?.text = question.questionFour
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}