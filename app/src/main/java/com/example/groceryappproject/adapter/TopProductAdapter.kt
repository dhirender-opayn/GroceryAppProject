package com.example.groceryappproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.groceryappproject.R

class TopProductAdapter :RecyclerView.Adapter<TopProductAdapter.TopProductViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopProductViewHolder {
        val view = TopProductViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.top_product_view_holder,parent,false))
        return view
     }

    override fun onBindViewHolder(holder: TopProductViewHolder, position: Int) {
     }

    override fun getItemCount(): Int {
        return 5
    }
    class TopProductViewHolder(item: View): RecyclerView.ViewHolder(item){


    }
}