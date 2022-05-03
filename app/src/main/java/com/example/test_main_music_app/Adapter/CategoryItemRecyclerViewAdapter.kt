package com.example.test_main_music_app.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.example.test_main_music_app.Model.AllCategory
import com.example.test_main_music_app.R

class CategoryItemRecyclerViewAdapter(private val fragment: Fragment, private val allCategory: ArrayList<String>)
    : RecyclerView.Adapter<CategoryItemRecyclerViewAdapter.CategoryViewHolder>(){
    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView:ImageView = itemView.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat_row_items, parent, false)
        return CategoryViewHolder(view)
    }
    

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = allCategory[position]
        Glide.with(fragment)
            .load(category)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return allCategory.size
    }


}