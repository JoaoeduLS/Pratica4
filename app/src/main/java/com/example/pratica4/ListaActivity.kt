package com.example.pratica4

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ListaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)

       var listView= findViewById<ListView>(R.id.listagem)
        var names = arreyOf( "Feijoada","Pão de Queijo","Bobo de Camarão","Acarage","Canjica","Bahian de Dois","Rabada","Pamonha","Tucupi","Mokoto")



        val botaovolta2 = findViewById<Button>(R.id.button4)
        botaovolta2.setOnClickListener {
            val intencao = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intencao)

        }
    }
}
