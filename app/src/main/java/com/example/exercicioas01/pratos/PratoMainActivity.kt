package com.example.exercicioas01.pratos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicioas01.R

class PratoMainActivity : AppCompatActivity() {
    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }
    val nomeDoRestaurante by lazy{findViewById<TextView>(R.id.tv_name2)}
    val imagemDoRestaurante by lazy { findViewById<ImageView>(R.id.iv_restaurante) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurante)

        val informacao = intent.extras

        if(informacao!= null) {
            val nomeRestaurante = informacao.getString("NAME")
            val imagemRestaurante = informacao.getInt("IMAGE",0)
            val restauranteEncontrado = InfoRestaurante(nomeRestaurante, imagemRestaurante)

            nomeDoRestaurante.text = restauranteEncontrado.nome
            imagemDoRestaurante.setImageResource(restauranteEncontrado.imagem)

        } else {
            Toast.makeText(this,"Error loading", Toast.LENGTH_LONG).show()
        }

        val pratos = getPratos()

        // é para o recyclerview saber como ele vai tratar os itens (o linearlayout mostra em forma de lista empilhada)
        // da para dizer tbm se é horizontal ou vertical
        recycler.layoutManager = GridLayoutManager(this,2)

        // aqui enviamos a lista de alunos para uso como parametro da classe adapter
        recycler.adapter = PratoAdapter(pratos)
    }

    // cria os alunos para uso na função on crete acima
    private fun getPratos(): List<Prato> {
        val pratosList = mutableListOf<Prato>()

            val prato1 = Prato("Salada com molho Gengibre", R.drawable.prato)
            pratosList.add(prato1)

            val prato2 = Prato("Salada com molho Gengibre", R.drawable.prato)
            pratosList.add(prato2)

            val prato3 = Prato("Salada com molho Gengibre", R.drawable.prato)
            pratosList.add(prato3)

            val prato4 = Prato("Salada com molho Gengibre", R.drawable.prato)
            pratosList.add(prato4)

            val prato5 = Prato("Salada com molho Gengibre", R.drawable.prato)
            pratosList.add(prato5)

            val prato6 = Prato("Salada com molho Gengibre", R.drawable.prato)
            pratosList.add(prato6)

            val prato7 = Prato("Salada com molho Gengibre", R.drawable.prato)
            pratosList.add(prato7)

            val prato8 = Prato("Salada com molho Gengibre", R.drawable.prato)
            pratosList.add(prato8)


        // usar toList aqui é somente para transformar a lista mutavel em uma lista imutável, que então é usada como lista de alunos fixa pela classe adapter
        return pratosList.toList()
    }
}