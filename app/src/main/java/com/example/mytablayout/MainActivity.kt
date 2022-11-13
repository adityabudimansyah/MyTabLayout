package com.example.mytablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setTitle("Tab Layout & View Pager")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null){
            val fragment = testFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, fragment, testFragment::class.simpleName)
                .commit()
        }

    }
}