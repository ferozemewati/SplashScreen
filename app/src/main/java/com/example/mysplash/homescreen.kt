package com.example.mysplash

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class homescreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        var btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener{
            Toast.makeText(this, "This is home scree", Toast.LENGTH_SHORT ).show()
        }
    }
}