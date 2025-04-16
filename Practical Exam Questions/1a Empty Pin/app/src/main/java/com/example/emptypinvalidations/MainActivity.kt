package com.example.emptypinvalidations

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (password.isEmpty()) {
                Toast.makeText(this, "PIN cannot be empty", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        }
    }
    // Override the back button press
    override fun onBackPressed() {
        // Create an AlertDialog when back button is pressed
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Are you sure you want to exit?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id ->
                super.onBackPressed() // Allow back press
            }
            .setNegativeButton("No") { dialog, id ->
                dialog.dismiss() // Dismiss the dialog
            }
        val alert = builder.create()
        alert.show()
    }
}