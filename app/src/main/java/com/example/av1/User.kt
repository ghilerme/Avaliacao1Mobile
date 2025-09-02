package com.example.av1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(
    val userName: String,
    val points: Int
): Parcelable