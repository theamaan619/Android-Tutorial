package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Lifecycle","onCreate Called")
        Toast.makeText(this, "onCreate Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart Called")
        Toast.makeText(this, "onStart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume Called")
        Toast.makeText(this, "OnResume Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause(){
        super.onPause()
        Log.d("Lifecycle", "onPause Called")
        Toast.makeText(this, "onPause Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop(){
        super.onStop()
        Log.d("Lifecycle", "onStop Called")
        Toast.makeText(this, "onStop Called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "onRestart Called")
        Toast.makeText(this, "onRestart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy Called")
        Toast.makeText(this, "onDestroy Called", Toast.LENGTH_SHORT).show()
    }
}