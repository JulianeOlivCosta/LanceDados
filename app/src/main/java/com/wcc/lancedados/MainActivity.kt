package com.wcc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados : Button = findViewById<Button>(R.id.LanceDadosBotao)
        val numeroDado1= findViewById<ImageView>(R.id.Dado1)
        val numeroDado2= findViewById<ImageView>(R.id.Dado2)

        botaoLancarDados.setOnClickListener {
            numeroDado1.setImageResource(lancaDado())
            numeroDado2.setImageResource(lancaDado())
        }
    }

    fun lancaDado(): Int {
        return recuperaFaceDado(geraNumero())
    }

    fun recuperaFaceDado(valor: Int): Int {

        return when (valor) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    fun geraNumero(): Int{
        return (1..6).random()
    }
}