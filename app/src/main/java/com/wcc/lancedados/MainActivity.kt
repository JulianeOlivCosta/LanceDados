package com.wcc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados : Button = findViewById<Button>(R.id.LanceDadosBotao)
        val valorDado1 : TextView = findViewById<TextView>(R.id.Dado1)
        val valorDado2 : TextView = findViewById<TextView>(R.id.dado2)

        botaoLancarDados.setOnClickListener {
            valorDado1.text = lancarDados ().toString()
            valorDado2.text = lancarDados ().toString()
        }
    }
    fun lancarDados(): Int{
        return (1..6).random()
    }
}