package com.example.sports_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.etUsername)
        val passwordEditText = findViewById<EditText>(R.id.etPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // You can add your email and password validation logic here

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Display a toast message
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()

                // Start the main activity
                val intent = Intent(this, doscreen::class.java)
                startActivity(intent)

                // Close this activity
                finish()
            } else {
                // Display an error toast message if email or password is empty
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
