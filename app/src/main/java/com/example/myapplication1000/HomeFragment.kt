package com.example.myapplication1000

import com.example.myapplication1000.databinding.FragmentHomeBinding

//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//
//
//class HomeFragment : Fragment() {
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
//    }
//
//
//}


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment using View Binding
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up click listeners for the buttons
        binding.buttonText.setOnClickListener {
            // Create an Intent for TextActivity
            val textIntent = Intent(activity, Activity1::class.java)
            startActivity(textIntent)
        }

        binding.buttonVideo.setOnClickListener {
            // Create an Intent for VideoActivity
            val videoIntent = Intent(activity, Activityvideo::class.java)
            startActivity(videoIntent)
        }
    }
}


