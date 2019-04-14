package com.example.coderswagapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswagapp.R
import com.example.coderswagapp.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
        categoriesTextView.text = categoryType
    }
}
