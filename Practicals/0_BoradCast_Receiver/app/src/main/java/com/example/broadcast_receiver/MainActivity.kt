package com.example.broadcast_receiver

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val c = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager;
        val networkinfo = c.activeNetworkInfo;
        if(networkinfo !=null && networkinfo.isConnected){
            if(networkinfo.type==ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(applicationContext,"Connected to Mobile",Toast.LENGTH_LONG).show()
            }
            if(networkinfo.type==ConnectivityManager.TYPE_WIFI){
                Toast.makeText(applicationContext,"Connected To Wifi",Toast.LENGTH_LONG).show()
            }

        }
        else{
            Toast.makeText(applicationContext,"Your are Offline",Toast.LENGTH_LONG).show()
        }
    }
}