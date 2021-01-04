package com.example.spacedimvisuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LobbyEmpty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lobby_empty)
        val button: Button = findViewById(R.id.buttonjoin)
        button.setOnClickListener {
            val intent = Intent(this@LobbyEmpty, LobbyPlayers::class.java)
            startActivity(intent)
        }

    }
}