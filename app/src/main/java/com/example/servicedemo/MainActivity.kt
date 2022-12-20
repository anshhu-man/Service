package com.example.servicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.servicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serviceIntent = Intent(this,BackgroundService::class.java)

        binding.apply {
            btnStart.setOnClickListener{
                Log.i("MYTAG","Starting Service")
                startService(serviceIntent)
            }
            btnStop.setOnClickListener {
                Log.i("MYTAG","Stopping Service")
                stopService(serviceIntent)
            }
        }
    }
}