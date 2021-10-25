package com.example.groceryappproject.adapter

 import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
 import androidx.recyclerview.widget.RecyclerView
import com.example.groceryappproject.R


class CategoryAdapter :RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = CategoryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.categories_view_holder, parent, false)
        )
        return view
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 4
    }

    class CategoryViewHolder(item:View):RecyclerView.ViewHolder(item){

    }
}