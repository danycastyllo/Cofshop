package com.example.cofshop.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v4.app.Fragment
import android.arch.lifecycle.ViewModelProvider
import android.content.Intent
import android.widget.ListView
import com.example.cofshop.databinding.FragmentProductsBinding

class ProductsFragment : Fragment() {

//    val producto = Producto("Camara", 100.0, "Camara ultimo modelo", R.drawable.ic_notifications_black_24dp)
//    val producto2 = Producto("PC", 1000.0, "16 GB RAM", R.drawable.ic_home_black_24dp)
//
//    val listaProductos = listOf(producto, producto2)

    private lateinit var productsViewModel: ProductsViewModel
    private var _binding: FragmentProductsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        productsViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                ProductsViewModel::class.java
            )

        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val lista: ListView = binding.lista
//        var listaProductos = listOf<Producto>()
//        notificationsViewModel.listaProductos.observe(viewLifecycleOwner, Observer {
//            listaProductos = it
//        })
//
        val adapter = ProductosAdapter(lista.context, productsViewModel.listaProductos)

        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(lista.context, ProductoActivity::class.java)
            intent.putExtra("producto", productsViewModel.listaProductos[position])
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}