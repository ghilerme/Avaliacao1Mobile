package com.example.av1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Flag(val imageResId: Int, val countryName: String) : Parcelable
