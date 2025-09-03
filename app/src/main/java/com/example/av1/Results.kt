package com.example.av1

import android.os.Build
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Results : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_results)

        // Manage user name
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

        val userName = user?.userName ?: "Usuário"
        val userNameTextView: TextView = findViewById(R.id.resultsHeader)
        userNameTextView.text = "Parabéns, ".plus(userName).plus("!")

        val score = intent.getIntExtra("score", 0)
        val scoreTextView: TextView = findViewById(R.id.resultsSubtitle)
        scoreTextView.text = "Sua pontuação foi de ".plus(score.toString()).plus(" pontos.")

        val answers = intent.getParcelableArrayListExtra<Answer>("answers") ?: arrayListOf()
        val listView: ListView = findViewById(R.id.answersList)
        listView.adapter = AnswerListAdapter(this, answers)

        // Go to main menu
        val mainMenuButton: Button = findViewById(R.id.mainMenuButton)
        mainMenuButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}