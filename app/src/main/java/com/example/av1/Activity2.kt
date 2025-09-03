package com.example.av1

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.view.View
import com.example.av1.Flag
import com.example.av1.R

class Activity2 : AppCompatActivity() {
    private val allFlags = listOf(
        Flag(R.drawable.flag_albania, "Albânia"),
        Flag(R.drawable.flag_algeria, "Argélia"),
        Flag(R.drawable.flag_anguilla, "Anguilla"),
        Flag(R.drawable.flag_austria, "Áustria"),
        Flag(R.drawable.flag_belize, "Belize"),
        Flag(R.drawable.flag_bhutan, "Butão"),
        Flag(R.drawable.flag_ethiopia, "Etiópia"),
        Flag(R.drawable.flag_finland, "Finlândia"),
        Flag(R.drawable.flag_france, "França"),
        Flag(R.drawable.flag_greece, "Grécia"),
        Flag(R.drawable.flag_honduras, "Honduras"),
        Flag(R.drawable.flag_hungrary, "Hungria"),
        Flag(R.drawable.flag_italy, "Itália"),
        Flag(R.drawable.flag_japan, "Japão"),
        Flag(R.drawable.flag_lebanon, "Líbano"),
        Flag(R.drawable.flag_madagascar, "Madagascar"),
        Flag(R.drawable.flag_malta, "Malta"),
        Flag(R.drawable.flag_mexico, "México"),
        Flag(R.drawable.flag_paraguay, "Paraguai"),
        Flag(R.drawable.flag_puerto_rico, "Porto Rico"),
        Flag(R.drawable.flag_south_africa, "África do Sul"),
        Flag(R.drawable.flag_south_korea, "Coréia do Sul"),
        Flag(R.drawable.flag_united_states, "Estados Unidos da América")
    )
    private var quizFlags: List<Flag> = listOf()
    private var currentQuestionIndex = 0
    private var score = 0
    private lateinit var textViewQuestionCounter: TextView
    private lateinit var imageViewFlag: ImageView
    private lateinit var editTextAnswer: EditText
    private lateinit var buttonSubmit: Button

    private lateinit var textViewFeedback: TextView

    private val answers = mutableListOf<Answer>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textViewQuestionCounter = findViewById(R.id.textView_questionCounter)
        imageViewFlag = findViewById(R.id.imageView_flag)
        editTextAnswer = findViewById(R.id.editText_answer)
        buttonSubmit = findViewById(R.id.button_submit)
        textViewFeedback = findViewById(R.id.textView_feedback)

        startNewGame()

        buttonSubmit.setOnClickListener {
            checkAnswer()
        }

        val bundle = intent.extras
    }

    //adicionar uma lista das respostas certas e erradas checkAnswer()
    private fun checkAnswer() {
        val userAnswer = editTextAnswer.text.toString()
        val correctAnswer = quizFlags[currentQuestionIndex].countryName

        val isCorrect = userAnswer.equals(correctAnswer, ignoreCase = true)

        if (isCorrect) {
            score += 20
            textViewFeedback.text = "Correto!"
            textViewFeedback.setTextColor(getColor(R.color.green))
        } else {
            textViewFeedback.text = "Incorreto! A resposta era: $correctAnswer"
            textViewFeedback.setTextColor(getColor(R.color.red))
        }

        val answer = Answer(
            question = quizFlags[currentQuestionIndex],
            userAnswer = userAnswer,
            correctAnswer = correctAnswer,
            isCorrect = isCorrect
        )
        answers.add(answer)

        textViewFeedback.visibility = View.VISIBLE

        currentQuestionIndex++

        if (currentQuestionIndex < quizFlags.size) {
            showNextQuestion()
        } else {
            // ir para a tela de resultados
            val bundle = intent.extras
            val user: User? = if (bundle != null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    bundle.getParcelable("user", User::class.java)
                } else {
                    bundle.getParcelable("user")
                }
            } else {
                null
            }
            val intent = Intent(this, Results::class.java)
            intent.putExtra("score", score)
            intent.putExtra("user", user)
            intent.putParcelableArrayListExtra("answers", ArrayList(answers))
            startActivity(intent)
            finish()
        }
    }

    private fun showNextQuestion() {
        val currentFlag = quizFlags[currentQuestionIndex]
        imageViewFlag.setImageResource(currentFlag.imageResId)
        textViewQuestionCounter.text = "Pergunta ${currentQuestionIndex + 1} de 5"
        editTextAnswer.text.clear()
    }
    private fun startNewGame() {
        score = 0
        currentQuestionIndex = 0
        quizFlags = allFlags.shuffled().take(5)
        showNextQuestion()
    }
}