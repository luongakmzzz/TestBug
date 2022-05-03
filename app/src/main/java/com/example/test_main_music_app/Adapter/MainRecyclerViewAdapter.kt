package com.example.test_main_music_app.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.test_main_music_app.Model.AllCategory
import com.example.test_main_music_app.R
import java.security.AccessControlContext
import java.util.*
import kotlin.collections.ArrayList

class MainRecyclerViewAdapter(private val fragment: Fragment, private val allCategory: ArrayList<String>)
    : RecyclerView.Adapter<MainRecyclerViewAdapter.MainViewHolder>() {
class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
   val title:TextView = itemView.findViewById(R.id.cat_title)

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_recycler_row_item_music, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val category = allCategory[position]
        holder.title.setText(category)
    }

    override fun getItemCount(): Int {
        return allCategory.size
    }

}