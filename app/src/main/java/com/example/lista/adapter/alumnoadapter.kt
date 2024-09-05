package com.example.lista.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lista.R
import com.example.lista.alumno

 class alumnoadapter(private val alumnolista:List<alumno>) : RecyclerView.Adapter<alumnoholderview>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): alumnoholderview {
        val layoutInflater = LayoutInflater.from(parent.context)
        return alumnoholderview(
            layoutInflater.inflate(R.layout.item_list, parent,  false ))
    }
        override fun onBindViewHolder(holder: alumnoholderview, position: Int) {
            val item = alumnolista [position]
            holder.render(item)
        }

    override fun getItemCount(): Int = alumnolista.size




 }
