package com.example.bookedme.onboarding

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bookedme.MainActivity
import com.example.bookedme.R
import com.example.bookedme.databinding.ActivityOnBoardingBinding
import com.fredericho.onboardingtesting2.onBoarding.OnBoardingAdapter
import com.fredericho.onboardingtesting2.onBoarding.OnBoardingPageTransforming

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityOnBoardingBinding
    private lateinit var adapter : OnBoardingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = OnBoardingAdapter(this)

        with(binding){

            viewpager.adapter = adapter
            viewpager.setPageTransformer(false, OnBoardingPageTransforming())
        }


    }

    fun nextPage(view : View){
        if (view.id == R.id.button){
            if (binding.viewpager.currentItem < adapter.count - 1){
                binding.viewpager.setCurrentItem(binding.viewpager.currentItem + 1, false)
            }
        }

        if (view.id == R.id.buttonNext){
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}