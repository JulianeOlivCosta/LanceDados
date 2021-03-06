package com.wcc.lancedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val playTutton = findViewById<Button>(R.id.playbutton)
        playTutton.setOnClickListener{
            var playerName = findViewById<EditText>(R.id.nameInputText).text.toString()

            var intent = Intent(this, MainActivity::class.java)

            intent.putExtra("playername", playerName)


            startActivity(intent)

        }
    }
}