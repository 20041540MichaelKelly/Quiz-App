package mick.projects.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "What are JavaScript Data Types?",
        R.drawable.js_logo, "Number",
                    "String",
                    "var",
                    "Undefined", 3)

        questionList.add(que1)

        val que2 = Question(1, "What are JavaScript Data Types?",
        R.drawable.js_logo, "Number",
                    "String",
                    "var",
                    "Undefined", 3)

        questionList.add(que2)

        val que3 = Question(1, "What are JavaScript Data Types?",
            R.drawable.js_logo, "Number",
            "String",
            "var",
            "Undefined", 3)

        questionList.add(que3)

        val que4 = Question(1, "What are JavaScript Data Types?",
            R.drawable.js_logo, "Number",
            "String",
            "var",
            "Undefined", 3)

        questionList.add(que4)

        val que5 = Question(1, "What are JavaScript Data Types?",
            R.drawable.js_logo, "Number",
            "String",
            "var",
            "Undefined", 3)

        questionList.add(que5)

        return questionList
    }
}