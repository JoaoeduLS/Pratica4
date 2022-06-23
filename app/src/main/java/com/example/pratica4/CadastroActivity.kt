package com.example.pratica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        val botao = findViewById<Button>(R.id.button3)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, ListaActivity::class.java)
            startActivity(intencao)
            val botaovolta = findViewById<Button>(R.id.button5)
            botaovolta.setOnClickListener {
                val intencao = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intencao)
            }
        }
    }
}