package com.example.sports_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class basket : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_basket)

        val kob = findViewById<Button>(R.id.button6)
        val jor = findViewById<Button>(R.id.button7)
        val leb = findViewById<Button>(R.id.button8)
        val shakk = findViewById<Button>(R.id.button9)

        kob.setOnClickListener{
            val intent = Intent(this, kobe::class.java)
            startActivity(intent)
        }

        jor.setOnClickListener{
            val intent = Intent(this, jord::class.java)
            startActivity(intent)
        }

        leb.setOnClickListener{
            val intent = Intent(this,lebro::class.java)
            startActivity(intent)
        }

        shakk.setOnClickListener{
            val intent = Intent(this, shak::class.java)
            startActivity(intent)
        }
        }
    }