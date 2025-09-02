package com.example.av1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editNome: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        editNome = this.findViewById(R.id.editNome)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun goNextActivity(view: View) {
        val userInput = editNome.text.toString()

        if (userInput.isBlank()) {
            editNome.error = "Por favor, insira seu nome"
            return
        }

        //val intent = Intent(this, Activity2::class.javaClass)

        val user = User (
            userName = userInput,
            points = 0
        )

        intent.putExtra("user", user)

        //startActivity(intent)
    }
}