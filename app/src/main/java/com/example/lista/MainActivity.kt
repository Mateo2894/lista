package com.example.lista

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lista.adapter.alumnoadapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecicleView()
        }
        private fun initRecicleView(){
        val recyclerView=findViewById<RecyclerView>(R.id.recyclealumno)
            recyclerView.layoutManager= LinearLayoutManager(this)
            recyclerView.adapter= alumnoadapter(alumnoprovider.alumnolista)
        }
    }
