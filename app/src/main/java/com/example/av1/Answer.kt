package com.example.av1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Answer(
    val question: Flag,
    val userAnswer: String,
    val correctAnswer: String,
    val isCorrect: Boolean
) : Parcelable