package com.example.groceryappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.groceryappproject.adapter.CategoryAdapter
import com.example.groceryappproject.adapter.ImageAdapter
import com.example.groceryappproject.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding :ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)
        val listimage = listOf(R.drawable.offer,R.drawable.offer)
//        binding.homePager.adapter =ImageAdapter(this)

        binding.rvCategories.adapter = CategoryAdapter()
    }
}