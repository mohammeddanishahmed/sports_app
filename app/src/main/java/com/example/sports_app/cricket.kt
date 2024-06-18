package com.example.sports_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cricket : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cricket)

        val kol = findViewById<Button>(R.id.button)
        val bab = findViewById<Button>(R.id.button3)
        val dil = findViewById<Button>(R.id.button4)
        val jos = findViewById<Button>(R.id.button5)

        kol.setOnClickListener{
            val intent = Intent(this, koli::class.java)
            startActivity(intent)
        }

        bab.setOnClickListener {
            val intent = Intent(this, babar::class.java)
            startActivity(intent)
        }

        dil.setOnClickListener {
            val intent = Intent(this, diliv::class.java)
            startActivity(intent)
        }

        jos.setOnClickListener{
            val intent = Intent(this, engl::class.java)
            startActivity(intent)
        }
    }
}