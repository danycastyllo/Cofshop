package com.example.cofshop.ui.product

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cofshop.R
import com.example.cofshop.databinding.ActivityProductoBinding
import com.example.cofshop.databinding.FragmentProductsBinding

class ProductoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val producto = intent.getSerializableExtra("producto") as Producto


        binding.nombreProducto.text = producto.nombre
        binding.precioProducto.text = "$${producto.precio}"
        binding.detallesProducto.text = producto.descripcion
        binding.imagen.setImageResource(producto.imagen)
    }
}