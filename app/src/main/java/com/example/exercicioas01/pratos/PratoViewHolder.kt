package com.example.exercicioas01.pratos

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicioas01.R

// viewholder é cada um dos quadradinhos mostrados no recycler view. o layout utilizado por ele vem do XML do aluno_item, que é passado para ele pelo adapter
class PratoViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val nomePrato by lazy {view.findViewById<TextView>(R.id.tv_nameprato)}
    val imagemPrato by lazy { view.findViewById<ImageView>(R.id.iv_prato1) }
}
