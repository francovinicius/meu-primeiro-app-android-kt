package com.vinicius.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vinicius.orgs.R
import com.vinicius.orgs.model.Produto
import com.vinicius.orgs.ui.recyclerview.adapter.ListaProdutoAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val nome = findViewById<TextView>(R.id.nome)
        val preco = findViewById<TextView>(R.id.preco)
        val descricao = findViewById<TextView>(R.id.descricao)

        nome.text = "Cesta de Frutas"
        descricao.text = "Laranja, Manga e Uva."
        preco.text = "19,99"

         */

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutoAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "testye",
                    descricao = "test",
                    preco = BigDecimal("19.99")
                ),
                Produto(
                    nome = "teste",
                    descricao = "test1",
                    preco = BigDecimal("89.99")
                ),
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)


    }

}