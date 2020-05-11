package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binds: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
