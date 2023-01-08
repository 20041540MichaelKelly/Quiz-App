package mick.projects.quizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Which is not a JavaScript Data Type?",
        R.drawable.js_logo, "Number",
                    "String",
                    "var",
                    "Undefined", 2)

        questionList.add(que1)

        val que2 = Question(2, "What is the isNaN function used for?",
        R.drawable.js_logo, "Returns true if the argument is not a number",
                    "Returns false if the argument is not a number",
                    "Returns an inbuilt exception",
                    "isNaN is not a function", 1)

        questionList.add(que2)

        val que3 = Question(3, "What do ‘this’ keyword refer from where it was called in JavaScript?",
            R.drawable.js_logo, "Refers to the class",
            "Refers to the object",
            "Refers to the function",
            "Refers to the value", 2)

        questionList.add(que3)

        val que4 = Question(4, "How NOT to empty an Array called arrayList? ",
            R.drawable.js_logo, "arrayList = [];",
            "arrayList.length = 0;",
            "arrayList.splice(0, arrayList.length);",
            "arrayList.empty();", 4)

        questionList.add(que4)

        val que5 = Question(5, "Javascript is an _______ language? ",
            R.drawable.js_logo, "Object-Oriented",
            "Object-Based",
            "Procedural",
            "None of the above", 1)

        questionList.add(que5)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que7 = Question(7, "which of the method is used to get HTML element in javascript?",
            R.drawable.js_logo, "getElementbyId()",
            "getElementbyClass()",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que7)

        val que8 = Question(8, "The \"let\" and \" var\" are known as:",
            R.drawable.js_logo, "Prototypes",
            "Declaration statements",
            "Data Types",
            "Keywords", 2)

        questionList.add(que8)

        val que9 = Question(9, "Which one is not a comparison operator? ",
            R.drawable.js_logo, "=",
            ">",
            "<",
            "!=", 1)

        questionList.add(que9)

        val que10 = Question(10, "Which symbol is used separate JavaScript statements? ",
            R.drawable.js_logo, "Comma(,)",
            "Colon(:)",
            "Hyphen(_)",
            "Semicolon(;)", 4)

        questionList.add(que10)

        val que11 = Question(11, "Which event is related to the keyboard? ",
            R.drawable.js_logo, "onFocus",
            "onClick",
            "onKeyDown",
            "onKeyPress", 4)

        questionList.add(que11)

        val que12 = Question(12, "Upon encountering empty statements, what does the Javascript Interpreter do? ",
            R.drawable.js_logo, "Throws an error",
            "Ignore the statements",
            "Gives a warning",
            "None of the above", 2)

        questionList.add(que12)



        val que13 = Question(13, "Which of the following methods can be used to display data in some form using Javascript? ",
            R.drawable.js_logo, "document.write()",
            "console.log()",
            "window.alert()",
            "All of the above", 4)

        questionList.add(que13)

        val que14 = Question(14, "How can a datatype be declared to be a constant type? ",
            R.drawable.js_logo, "const",
            "var",
            "let",
            "constant", 1)

        questionList.add(que14)

        val que15 = Question(15, "What keyword is used to check whether a given property is valid or not? ",
            R.drawable.js_logo, "in",
            "is in",
            "exists",
            "lies", 1)

        questionList.add(que15)

        /*val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)

        val que6 = Question(6, "Which of the keyword is used to define the variable in the javascript? ",
            R.drawable.js_logo, "var",
            "let",
            "Both of the above",
            "None of the above", 3)

        questionList.add(que6)*/

        return questionList
    }
}