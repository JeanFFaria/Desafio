package com.example.exercicioas01.pratos

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicioas01.PratoDescricao
import com.example.exercicioas01.R

class PratoAdapter(val pratosList: List<Prato>) :RecyclerView.Adapter<PratoViewHolder>() {

    // retorna o viewholder que é pra ser exibido
    // a função abaixo infla o layout e passa para o viewholder, que por sua vez adiciona ao layout nome e matricula. Notar que nesse momento o viewholder sabe qual o layout mas ainda não sabe o nome e matricula, que só serão passados quando a função onBindViewHolder for executada mais abaixo
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratoViewHolder {

        // view que está sendo inflada
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prato_item, parent, false)

        // aqui é dito para o viewholder que  ele usará o layout aluno_item indicado acima
        return PratoViewHolder(view)
    }

    // descobre o tamanho da lista do recyclerview
    override fun getItemCount() = pratosList.size

    // o holder abaixo é criado uma única vez. No caso do whatsapp é como se 5 contatos fossem criados, depois o que muda não é o holder, mas a informação dentro dele (que faz aparecer diferentes contatos)
    // aqui são setados os textos de nome e matricula de cada posição da lista de alunos no XML aluno_item
    // no momento da realização do scroll, essa função vai sendo chamada para carregar os dados a medida da necessidade
    // principal função para criação do recycler view
    // como o holder extende de viewholder, ele já sabe que o viewholder usa a view indicada na função onCreateViewHolder e que ele possui duas variaveis a serem inicializadas, nome e matricula
    override fun onBindViewHolder(holder: PratoViewHolder, position: Int) {

        val name = holder.nomePrato
        name.text = pratosList[position].nome

        val imagem = holder.imagemPrato
        imagem.setImageResource(pratosList[position].imagem)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, PratoDescricao::class.java)
            it.context.startActivity(intent)
        }
    }
}


