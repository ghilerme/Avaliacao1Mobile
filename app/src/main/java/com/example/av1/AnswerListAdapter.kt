package com.example.av1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat

class AnswerListAdapter(
    private val context: Context,
    private val answers: List<Answer>
) : BaseAdapter() {
    override fun getCount(): Int = answers.size

    override fun getItem(position: Int): Any = answers[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_answer, parent, false)

        val answer = answers[position]

        val countryText: TextView = view.findViewById(R.id.textView_country)
        val resultText: TextView = view.findViewById(R.id.textView_result)

        countryText.text = answer.question.countryName

        if (answer.isCorrect) {
            resultText.text = "Correto"
            resultText.setTextColor(ContextCompat.getColor(context, R.color.green))
        } else {
            resultText.text = "Incorreto"
            resultText.setTextColor(ContextCompat.getColor(context, R.color.red))
        }

        return view
    }
}