package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        findViewById() -> Encontrar uma View pelo ID dela.
        */

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD6.setOnClickListener {
            Toast.makeText(this, "Timóteo agradece a participação =)", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }

        buttonD12.setOnClickListener {
            Toast.makeText(this, "Timóteo agradece a participação =)", Toast.LENGTH_LONG).show()
            rolarDados12(12)
        }

        buttonD20.setOnClickListener {
            Toast.makeText(this, "Timóteo agradece a participação =)", Toast.LENGTH_LONG).show()
            rolarDados20(20)
        }
    }

    private fun rolarDados20(lados20: Int) {
        val rolagem20 = (1..lados20).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem20.toString()
    }

    private fun rolarDados12(lados12: Int) {
        val rolagem12 = (1..lados12).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem12.toString()
    }

    private fun rolarDados(lados: Int) {
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()
    }
}