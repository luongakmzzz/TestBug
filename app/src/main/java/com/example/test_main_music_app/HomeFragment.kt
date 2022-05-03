package com.example.test_main_music_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.test_main_music_app.Adapter.CategoryItemRecyclerViewAdapter
import com.example.test_main_music_app.Adapter.MainRecyclerViewAdapter
import com.example.test_main_music_app.Model.AllCategory
import com.example.test_main_music_app.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var arrayMusic: ArrayList<String> = ArrayList()

    private lateinit var mainRecyclerAdapter: CategoryItemRecyclerViewAdapter


    private lateinit var  binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        Glide.with(this).load("https://o.rada.vn/data/image/2022/02/28/Chim-sau-700.jpg").into(binding.imageView)

//        arrayMusic.add(R.drawable.ic_person.toString())
        arrayMusic.add("https://o.rada.vn/data/image/2022/02/28/Chim-sau-700.jpg")
        arrayMusic.add("https://o.rada.vn/data/image/2022/02/28/Chim-sau-700.jpg")
        arrayMusic.add("https://o.rada.vn/data/image/2022/02/28/Chim-sau-700.jpg")
        arrayMusic.add("https://o.rada.vn/data/image/2022/02/28/Chim-sau-700.jpg")
        arrayMusic.add("https://o.rada.vn/data/image/2022/02/28/Chim-sau-700.jpg")
        arrayMusic.add("https://o.rada.vn/data/image/2022/02/28/Chim-sau-700.jpg")
        arrayMusic.add("https://o.rada.vn/data/image/2022/02/28/Chim-sau-700.jpg")


        binding.mainrecyclerviewmusic.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        mainRecyclerAdapter = CategoryItemRecyclerViewAdapter(HomeFragment(), arrayMusic)
        binding.mainrecyclerviewmusic.adapter = mainRecyclerAdapter
        return binding.root


    }



}