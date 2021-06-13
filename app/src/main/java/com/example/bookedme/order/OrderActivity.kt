package com.example.cartbookedme.order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cartbookedme.R
import com.example.cartbookedme.databinding.ActivityOrderBinding
import com.google.android.material.tabs.TabLayoutMediator

class OrderActivity : AppCompatActivity() {

    private lateinit var binding : ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.elevation = 0f
        binding.viewPager.adapter = ViewPagerAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.setText(ViewPagerAdapter.TAB_TITLE[position])
        }.attach()
    }
}