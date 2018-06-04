package com.example.dennis.examendennisveintimilla

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ActoresAdaptador(private val listaActores: List<Actor>) : RecyclerView.Adapter<ActoresAdaptador.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val actor: Actor = listaActores[position]

        holder?.textViewNombres?.text = actor.nombres
        holder?.textViewApellidos?.text = actor.apellidos

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.activity_modelo_lista_actores, parent, false)
        return  ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listaActores.size
    }


    class ViewHolder (itemview: View) : RecyclerView.ViewHolder(itemview){
        val textViewNombres = itemView.findViewById(R.id.textViewNombres) as TextView
        val textViewApellidos = itemView.findViewById(R.id.textViewApellidos) as TextView
    }


}