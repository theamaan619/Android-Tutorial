package com.example.a7aregistrationform

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val username = findViewById<EditText>(R.id.etUsername)
        val email = findViewById<EditText>(R.id.etEmail)
        val phone = findViewById<EditText>(R.id.etPhone)
        val password = findViewById<EditText>(R.id.etPassword)
        val submitBtn = findViewById<FloatingActionButton>(R.id.btnSubmit)

        submitBtn.setOnClickListener {
            val user = username.text.toString()
            val mail = email.text.toString()
            val phoneNumber = phone.text.toString()
            val pass = password.text.toString()

            Toast.makeText(this, "Registered: $user", Toast.LENGTH_SHORT).show()
        }
    }
}