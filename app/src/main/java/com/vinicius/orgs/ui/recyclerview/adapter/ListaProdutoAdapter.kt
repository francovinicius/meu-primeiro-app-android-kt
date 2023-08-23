package com.vinicius.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vinicius.orgs.R
import com.vinicius.orgs.model.Produto

class ListaProdutoAdapter(
    private val context: Context,
    private val produtos: List<Produto>

)    : RecyclerView.Adapter<ListaProdutoAdapter.ViewHolder>() {

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            val preco = itemView.findViewById<TextView>(R.id.preco)
            nome.text = produto.nome
            descricao.text = produto.descricao
            preco.text = produto.preco.toPlainString()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = produtos.size



}
