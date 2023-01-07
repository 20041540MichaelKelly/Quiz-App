package mick.projects.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvCongrats: TextView = findViewById(R.id.tv_congratulations)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        if(correctAnswers <= 3) {
            tvCongrats.text = getString(R.string.less_than_or_equal_three)
        }else if( correctAnswers <= 7 ) {
            tvCongrats.text = getString(R.string.less_than_or_equal_seven)
        } else {
            tvCongrats.text = getString(R.string.victory)
        }

        tvScore.text = "Your score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}