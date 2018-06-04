package com.example.dennis.examendennisveintimilla

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.LinearLayout
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_lista_actores.*


class ListarActores : AppCompatActivity() {
        val actores = ArrayList<Actor>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_actores)
        //crearDatosPrueba()
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adaptador = ActoresAdaptador(actores)

        val layoutManager = LinearLayoutManager(this)


        actores.addAll(crearDatosPrueba())

        recyclerView.layoutManager=layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adaptador

        //actores.addAll(crearDatosPrueba())

        adaptador.notifyDataSetChanged()
        Log.i("vista-principal", "Cambio personas ${actores.size}")
    }

    fun crearDatosPrueba(): ArrayList<Actor> {
        var actores = ArrayList<Actor>()
        actores.add(Actor(1, "Dennis Fernando", "Veintimilla Alvarado", "23/08/1996", 3, false))
        actores.add(Actor(2, "Cameron Díaz", "Cameron Diaz", "23/08/1996", 3, false))

        actores.add(Actor(3, "Mel Gibson", "Mel Gibson", "23/08/1996", 3, false))

        actores.add(Actor(4, "xDD", "aPELLIDO aPELLIDO", "23/08/1996", 3, false))


        return actores
    }








}


