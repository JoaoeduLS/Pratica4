package com.example.pratica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)
        val botaoentrada = findViewById<Button>(R.id.entra)
        botaoentrada.setOnClickListener {
            val intencao = Intent(applicationContext, ListaActivity:: class.java)
            startActivity(intencao)
        }
        val botaocadastro = findViewById<Button>(R.id.button2)
        botaocadastro.setOnClickListener {
            val intencao = Intent(applicationContext, CadastroActivity:: class.java)
            startActivity(intencao)
        }
    }
}