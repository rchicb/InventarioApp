package com.example.distribuidorachic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_producto.*

class DetalleProducto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_producto)

        var producto=intent.getSerializableExtra("producto") as Producto

        this.nombre_producto.text=producto.nombre
        this.precio_producto.text="Q ${producto.precio}"
        this.descripcion_producto.text=producto.descripcion
        this.imageView2.setImageResource(producto.imagen)
    }
}
