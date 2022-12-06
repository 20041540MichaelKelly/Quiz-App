package mick.projects.quizapp

import android.app.PendingIntent.OnFinished
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedQuestion: Int = 0

    private var mSubmitButton: Button? = null

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
        mQuestionList = Constants.getQuestions()

        setQuestions()
        defaultOptionsView()
    }

    private fun setQuestions() {
        val question: Question = mQuestionList!![mCurrentPosition -1]
        progressBar?.progress = mCurrentPosition
        tvProgressBar?.text = "$mCurrentPosition/ ${progressBar?.max}"
        tvQuestion?.text = question.question
        answerOne?.text = question.questionOne
        answerTwo?.text = question.questionTwo
        answerThree?.text = question.questionThree
        answerFour?.text = question.questionFour

        if(mCurrentPosition == mQuestionList!!.size) {
            mSubmitButton?.text = "FINISH"
        } else {
            mSubmitButton?.text = "SUBMIT"
        }

    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()

        answerOne?.let {
            options.add(0, it)
        }
        answerTwo?.let {
            options.add(1, it)
        }
        answerThree?.let {
            options.add(2, it)
        }
        answerFour?.let {
            options.add(3, it)
        }

        for(option in options) {
            option.setTextColor(Color.parseColor("#476234f"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_background)
        }

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}