package com.example.aula31recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicioas01.restaurante.Restaurante
import com.example.exercicioas01.R
import com.example.exercicioas01.pratos.PratoMainActivity

class RestauranteAdapter(val restaurantesList: MutableList<Restaurante>) :RecyclerView.Adapter<RestauranteViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurante_item, parent, false)

        return RestauranteViewHolder(view)
    }

    override fun getItemCount() = restaurantesList.size

    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {

        val name = holder.name
        name.text = restaurantesList[position].nome

        val endereco = holder.endereco
        endereco.text = restaurantesList[position].endereco

        val horario = holder.horario
        horario.text = restaurantesList[position].horario

        val imagem = holder.imagem
        imagem.setImageResource(restaurantesList[position].imagem)

        holder.itemView.setOnClickListener{
            val intent = Intent(it.context,PratoMainActivity::class.java)
            intent.putExtra("NAME",restaurantesList[position].nome)
            intent.putExtra("IMAGE",restaurantesList[position].imagem)
            it.context.startActivity(intent)
        }
    }
}


