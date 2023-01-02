package mick.projects.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startButton : Button = findViewById(R.id.startButton)
        var etName : EditText = findViewById(R.id.etName)

        startButton.setOnClickListener {
            if(etName.text.isEmpty()) {
                Toast.makeText(this, "***Error: Name not Included***", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}