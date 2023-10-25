package com.example.customrecyclermodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val customAdapter = CustomRecyclerAdapter(mutableListOf("Вася", "Петя", "Жора"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RecyclerView>(R.id.rw).layoutManager = LinearLayoutManager(this)
        findViewById<RecyclerView>(R.id.rw).adapter = customAdapter
    }
}