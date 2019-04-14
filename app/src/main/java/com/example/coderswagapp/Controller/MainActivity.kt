package com.example.coderswagapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.coderswagapp.Adapters.CategoryAdapter
import com.example.coderswagapp.Adapters.CategoryRecycleAdaptor
import com.example.coderswagapp.Model.Category
import com.example.coderswagapp.R
import com.example.coderswagapp.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdaptor(this, DataService.categories)

        categoryListView.adapter = adapter


        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


    }
}
