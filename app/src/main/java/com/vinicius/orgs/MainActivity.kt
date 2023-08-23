package com.vinicius.orgs

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        val preco = findViewById<TextView>(R.id.preco)
        val descricao = findViewById<TextView>(R.id.descricao)

        nome.text = "Cesta de Frutas"
        descricao.text = "Laranja, Manga e Uva."
        preco.text = "19,99"





    }

}