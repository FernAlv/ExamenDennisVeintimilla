package com.example.dennis.examendennisveintimilla

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonCrearActor.setOnClickListener{
            v: View? -> irALayout()
        }

        botonListarActores.setOnClickListener{
            v: View? -> irALayout2()
        }
    }

    fun irALayout(){
        val intent = Intent(this, CrearActor::class.java )
        startActivity(intent)
    }

    fun irALayout2(){
        val intent = Intent(this, ListarActores::class.java )
        startActivity(intent)
    }
}
