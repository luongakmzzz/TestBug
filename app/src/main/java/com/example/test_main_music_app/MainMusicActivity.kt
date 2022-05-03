package com.example.test_main_music_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.test_main_music_app.databinding.ActivityMainMusicBinding

import com.google.android.material.bottomnavigation.BottomNavigationView
import java.nio.file.Files.find
import java.util.zip.Inflater

class MainMusicActivity : AppCompatActivity() {

    lateinit var bottombar: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainMusicBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main_music)




        bottombar = findViewById(R.id.bottombar)

        replaceFragment(HomeFragment())


        bottombar.setOnNavigationItemSelectedListener {

            when(it.itemId) {
                R.id.nav_home -> replaceFragment(HomeFragment())
                R.id.nav_music -> replaceFragment(MusicFragment())
                R.id.nav_profile -> replaceFragment(ProfileFragment())
                R.id.nav_settings -> replaceFragment(SettingsFragment())
            }

            return@setOnNavigationItemSelectedListener true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        if(fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragments, fragment)
            transaction.commit()
        }
    }
}
