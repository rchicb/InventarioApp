package com.example.distribuidorachic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.VariablesyConstantes()
        this.crearLista()

    }

    fun VariablesyConstantes(){
        var miTexto="hola mundo"
        println("$miTexto desde una funcion")
    }

    fun crearLista(){
        var producto=Producto("Camara",200.0,"Ultima generacion",R.drawable.camara)
        var producto2=Producto("Botas",500.0,"Industriales",R.drawable.camara)

        var listaProducto= listOf(producto,producto2)
        var adaptador=AdaptadorProducto(this,listaProducto)

        lista.adapter=adaptador
        lista.setOnItemClickListener { parent, view, position, id ->
            var intent = Intent(this,DetalleProducto::class.java)
            intent.putExtra("producto",listaProducto[position])
            startActivity(intent)
        }
    }




}
