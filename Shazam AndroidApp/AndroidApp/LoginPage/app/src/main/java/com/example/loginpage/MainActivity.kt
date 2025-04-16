package com.example.loginpage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.userName)
        val password = findViewById<EditText>(R.id.userPassword)
        val error = findViewById<TextView>(R.id.errorMessage)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val backButton = findViewById<Button>(R.id.backButton)

        submitButton.setOnClickListener(){
            error.text=""
            val userName = name.text.toString().trim()
            val  userPassword = password.text.toString().trim()
            if(userName.isEmpty() || userPassword.isEmpty()){
                error.text = "All fields are required!"
                return@setOnClickListener
            }
            error.text=""
            Toast.makeText(this, "Welcome Sir!", Toast.LENGTH_SHORT).show()

        }

        backButton.setOnClickListener(){
            Toast.makeText(this, "Alert Dialog", Toast.LENGTH_SHORT).show()
        }

    }
}