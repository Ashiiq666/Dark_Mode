package com.restaurant.salkararestaurant.darkmodr

import android.content.Context
import android.content.SharedPreferences
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.restaurant.salkararestaurant.darkmodr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var nm = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        init()
    }

    private fun init() {

        binding?.switch1?.setOnClickListener {
            if (binding?.switch1?.isChecked == true) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                binding?.switch1?.backgroundTintList =
                    ColorStateList.valueOf(Color.parseColor("#ffffff"))

            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }/*
       binding?.btnSwitch?.setOnClickListener {
           if (nm) {
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
               binding?.btnSwitch?.backgroundTintList= ColorStateList.valueOf(Color.parseColor("#ffffff"))
               nm= false
           } else {
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
               nm = false

           }
           }
      */
    }
}
