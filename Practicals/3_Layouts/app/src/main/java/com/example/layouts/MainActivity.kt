package com.example.layouts

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.R.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layout.activity_main)

        //Accessing the button with their ID
        val button1: Button = findViewById(id.button1)
        val button2: Button = findViewById(id.button2)

        //Setting onClick Listeners for buttons
        button1.setOnClickListener{
            Toast.makeText(this,"Button 1 Clicked",Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener{
            Toast.makeText(this,"Button 2 Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}