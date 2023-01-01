package mick.projects.quizapp

import android.app.ProgressDialog.show
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
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

    private var mAnswerOne: TextView?= null
    private var mAnswerTwo: TextView?= null
    private var mAnswerThree: TextView?= null
    private var mAnswerFour: TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qustions)

        progressBar = findViewById(R.id.progressBar)
        tvProgressBar = findViewById(R.id.tv_prog)
        tvQuestion = findViewById(R.id.tv_question)
        mAnswerOne = findViewById(R.id.anwserOne)
        mAnswerTwo = findViewById(R.id.anwserTwo)
        mAnswerThree = findViewById(R.id.anwserThree)
        mAnswerFour = findViewById(R.id.anwserFour)
        mSubmitButton = findViewById(R.id.submitButton)
        mQuestionList = Constants.getQuestions()

        setQuestions()
        defaultOptionsView()
    }

    private fun setQuestions() {
        defaultOptionsView()
        val question: Question = mQuestionList!![mCurrentPosition -1]
        progressBar?.progress = mCurrentPosition
        tvProgressBar?.text = "$mCurrentPosition/ ${progressBar?.max}"
        tvQuestion?.text = question.question
        mAnswerOne?.text = question.questionOne
        mAnswerTwo?.text = question.questionTwo
        mAnswerThree?.text = question.questionThree
        mAnswerFour?.text = question.questionFour

        mAnswerOne?.setOnClickListener(this)

        mAnswerTwo?.setOnClickListener(this)

        mAnswerThree?.setOnClickListener(this)

        mAnswerFour?.setOnClickListener(this)

        mSubmitButton?.setOnClickListener(this)

        if(mCurrentPosition == mQuestionList!!.size) {
            mSubmitButton?.text = "FINISH"
        } else {
            mSubmitButton?.text = "SUBMIT"
        }

    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()

        mAnswerOne?.let {
            options.add(0, it)
        }
        mAnswerTwo?.let {
            options.add(1, it)
        }
        mAnswerThree?.let {
            options.add(2, it)
        }
        mAnswerFour?.let {
            options.add(3, it)
        }

        for(option in options) {
            option.setTextColor(Color.parseColor("#000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_background)
        }

    }

    private fun selectedFunOptionsView(textView: TextView, selectedOptionNumber: Int) {
       // defaultOptionsView()

        mSelectedQuestion = selectedOptionNumber

        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(this, R.drawable.selected_background)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.anwserOne -> {
                mAnswerOne?.let {
                    selectedFunOptionsView(it, 1)
                }
            }
            R.id.anwserTwo -> {
                mAnswerTwo?.let {
                    selectedFunOptionsView(it, 2)

                }
            }
            R.id.anwserThree -> {
                mAnswerThree?.let {
                    selectedFunOptionsView(it, 3)

                }
            }
            R.id.anwserFour -> {
                mAnswerFour?.let {
                    selectedFunOptionsView(it, 4)

                }
            }

            R.id.submitButton -> {
               mSubmitButton?.let {
                    if(mSelectedQuestion == 0) {
                        mCurrentPosition++

                        when{
                            mCurrentPosition <= mQuestionList!!.size -> {
                                setQuestions()
                            }
                            else -> {
                                Toast.makeText(this, "Congrats!! you are now an elite programmer", Toast.LENGTH_LONG).show()
                            }
                        }
                    }else{
                        val question = mQuestionList?.get(mCurrentPosition - 1)
                        if(question!!.correctAns != mSelectedQuestion) {
                            answerView(mSelectedQuestion, R.drawable.wrong_ans)
                        }
                        answerView(question.correctAns, R.drawable.correct_ans)

                        if(mCurrentPosition == mQuestionList!!.size) {
                            mSubmitButton?.text = "FINISH"
                        }else{
                            mSubmitButton?.text = "GO TO THE NEXT QUESTION"
                        }

                        mSelectedQuestion = 0
                    }
               }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
         when(answer) {
             1 -> {
                 mAnswerOne?.background = ContextCompat.getDrawable(this, drawableView)
             }
             2 -> {
                 mAnswerTwo?.background = ContextCompat.getDrawable(this, drawableView)
             }
             3 -> {
                 mAnswerThree?.background = ContextCompat.getDrawable(this, drawableView)
             }
             4 -> {
                 mAnswerFour?.background = ContextCompat.getDrawable(this, drawableView)
             }
         }
    }
}