package com.example.exercicioas01.restaurante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aula31recyclerview.RestauranteAdapter
import com.example.exercicioas01.R


class MainActivity : AppCompatActivity() {
    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val restaurantes = getRestaurantes()

        recycler.layoutManager = LinearLayoutManager(this)

        val adapter = RestauranteAdapter(restaurantes)
        recycler.adapter = adapter


        }

    }

    private fun getRestaurantes(): MutableList<Restaurante> {
        val alunosList = mutableListOf<Restaurante>()

            val restaurante1 = Restaurante("Tony Roma's", "Av. Lavandisca,717", "Fecha às 00:00", R.drawable.raster)
            alunosList.add(restaurante1)

            val restaurante2 = Restaurante("Aoyama - Moema", "Alameda dos Arapanés, 532", "Fecha às 00:00", R.drawable.aoyama)
            alunosList.add(restaurante2)

            val restaurante3 = Restaurante("Outback - Moema", "Av. Moaci, 187", "Fecha às 00:00", R.drawable.raster)
            alunosList.add(restaurante3)

            val restaurante4 = Restaurante("Sí Señor", "Alameda Jauaperi, 626", "Fecha às 00:00", R.drawable.aoyama)
            alunosList.add(restaurante4)

        return alunosList.toMutableList()
    }
