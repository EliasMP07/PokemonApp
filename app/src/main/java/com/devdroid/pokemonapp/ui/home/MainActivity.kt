package com.devdroid.pokemonapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devdroid.pokemonapp.R
import com.devdroid.pokemonapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}