package com.example.lista.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lista.R
import com.example.lista.alumno

class alumnoholderview (view: View):RecyclerView.ViewHolder(view){
    val nombre = view.findViewById<TextView>(R.id.nombre)
    val correo = view.findViewById<TextView>(R.id.correo)
    val cuenta = view.findViewById<TextView>(R.id.cuenta)
    val foto = view.findViewById<ImageView>(R.id.foto)

    fun render (alumnomodel:alumno){
        nombre.text=alumnomodel.alumnonombre
        correo.text = alumnomodel.correo
        cuenta.text = alumnomodel.cuenta
        Glide.with(foto.context).load(alumnomodel.foto).into(foto)
    }
}