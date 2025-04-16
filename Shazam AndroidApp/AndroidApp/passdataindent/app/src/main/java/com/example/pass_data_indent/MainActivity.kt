package com.example.pass_data_indent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val userName = findViewById<EditText>(R.id.username)
        val send = findViewById<Button>(R.id.sendButton)

        send.setOnClickListener(){
            val name = userName.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("userName", name)
            startActivity(intent)
        }
    }
}