package com.example.distribuidorachic

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_producto.view.*

class AdaptadorProducto(var mContext: Context, var listaProducto:List<Producto>): ArrayAdapter<Producto>(mContext,0,listaProducto) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var layout=LayoutInflater.from(mContext).inflate(R.layout.item_producto,parent,false)
        var producto=listaProducto[position]

        layout.nombre.text=producto.nombre
        layout.precio.text="Q ${producto.precio}"
        layout.imageView.setImageResource(producto.imagen)

        return layout
    }
}