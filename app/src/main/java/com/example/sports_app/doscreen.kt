package com.example.sports_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class doscreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doscreen)

        val butcri = findViewById<Button>(R.id.babe)
        val butbas = findViewById<Button>(R.id.button2)

        butcri.setOnClickListener {
            val intent = Intent(this, cricket::class.java)
            startActivity(intent)
        }

        butbas.setOnClickListener{
            val intent = Intent(this, basket::class.java)
            startActivity(intent)
        }
    }
}