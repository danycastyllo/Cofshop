package com.example.cofshop.ui.product

import android.arch.lifecycle.ViewModel
import com.example.cofshop.R

class ProductsViewModel : ViewModel() {

    val producto = Producto("Camara", 100.0, "Camara ultimo modelo", R.drawable.ic_baseline_shopping_basket_24)
    val producto2 = Producto("PC", 1000.0, "16 GB RAM", R.drawable.ic_home_black_24dp)

    val listaProductos = listOf(producto, producto2)


//    private val _listaProductos = MutableLiveData<List<Producto>>().apply {
//        value = listOf(producto, producto2)
//    }
//    val listaProductos: LiveData<List<Producto>> = _listaProductos

}