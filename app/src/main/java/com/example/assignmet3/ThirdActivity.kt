package com.example.assignment3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.assignmet3.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textViewFinalData: TextView = findViewById(R.id.textViewFinalData)
        val finalData = intent.getStringExtra("finalData")

        textViewFinalData.text = finalData
    }
}