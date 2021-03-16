package com.example.aula31recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicioas01.R

// viewholder é cada um dos quadradinhos mostrados no recycler view. o layout utilizado por ele vem do XML do aluno_item, que é passado para ele pelo adapter
class RestauranteViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val name by lazy {view.findViewById<TextView>(R.id.tv_name)}
    val endereco by lazy {view.findViewById<TextView>(R.id.tv_endereco)}
    val horario by lazy {view.findViewById<TextView>(R.id.tv_horario)}
    val imagem by lazy { view.findViewById<ImageView>(R.id.iv_restaurante) }
}