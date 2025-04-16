package com.example.pass_data_indent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("userName")
        val greeting = findViewById<TextView>(R.id.displayText)
        greeting.text = "Hello, $name"
    }
}