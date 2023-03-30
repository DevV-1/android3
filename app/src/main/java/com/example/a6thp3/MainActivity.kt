package com.example.a6thp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val d=c(this) //linking c.kt
        super.onCreate(savedInstanceState)
        setContentView(d)
    }
}