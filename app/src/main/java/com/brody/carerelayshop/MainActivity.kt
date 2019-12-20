package com.brody.carerelayshop

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.brody.carerelayshop.model.Product

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val products = arrayListOf<Product>()

        for (i in 0..100) {
            products.add(Product("Deluxe Two Button Folding Walker", "https://images-na.ssl-images-amazon.com/images/I/71tZOsMv-wL._SL1500_.jpg", 56.44))
        }

        recycler_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = ProductsAdapter(products)

        }
    }
}
