package mick.projects.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Which is not a JavaScript Data Type?",
        R.drawable.js_logo, "Number",
                    "String",
                    "var",
                    "Undefined", 2)

        questionList.add(que1)

        val que2 = Question(2, "What is the isNaN function used for?",
        R.drawable.js_logo, "isNan function returns true if the argument is not a number",
                    "isNan function returns false if the argument is not a number",
                    "returns an inbuilt exception",
                    "isNaN is not a function", 0)

        questionList.add(que2)

        val que3 = Question(3, "What is ‘this’ keyword in JavaScript?",
            R.drawable.js_logo, "‘This’ keyword refers to the class from where it was called",
            "‘This’ keyword refers to the object from where it was called",
            "‘This’ keyword refers to the function from where it was called",
            "‘This’ keyword refers to the value from where it was called", 1)

        questionList.add(que3)

        val que4 = Question(4, "What are JavaScript Data Types? no.4",
            R.drawable.js_logo, "Number",
            "String",
            "var",
            "Undefined", 3)

        questionList.add(que4)

        val que5 = Question(5, "What are JavaScript Data Types? no.5",
            R.drawable.js_logo, "Number",
            "String",
            "var",
            "Undefined", 3)

        questionList.add(que5)

        return questionList
    }
}