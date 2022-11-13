package com.example.mytablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytablayout.databinding.FragmentTestBinding
import com.google.android.material.tabs.TabLayoutMediator


class testFragment : Fragment() {

    private var _binding: FragmentTestBinding? = null
    private val binding get()= _binding!!
    private lateinit var viewPagerAdapter: viewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPagerAdapter = viewPagerAdapter(this)
        with(binding){
            viewPager.adapter = viewPagerAdapter

            TabLayoutMediator(tabLayout, viewPager){ tab, position ->
                when(position){
                    0 -> tab.text = "Tab Pertama"
                    1 -> tab.text = "Tab Kedua"
                }
            }.attach()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}