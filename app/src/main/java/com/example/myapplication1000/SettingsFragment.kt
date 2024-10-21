package com.example.myapplication1000

import android.annotation.SuppressLint

//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//
//
//class SettingsFragment : Fragment() {
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_settings, container, false)
//    }
//
//
//}



//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import android.widget.LinearLayout
//import android.content.Intent
//
//class SettingsFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_settings, container, false)
//
//        // Personal Information Click Listener
//
////        val personalInfo: LinearLayout = view.findViewById(R.id.personal_info)
////        personalInfo.setOnClickListener {
////            // Handle navigation to Personal Information Activity/Fragment
////            val intent = Intent(activity, PersonalInformationActivity::class.java)
////            startActivity(intent)
////        }
//
//        // Payments and Payouts Click Listener
//
////        val payments: LinearLayout = view.findViewById(R.id.payments_and_payouts)
////        payments.setOnClickListener {
////            // Handle navigation to Payments Activity/Fragment
////            val intent = Intent(activity, PaymentsActivity::class.java)
////            startActivity(intent)
////        }
//
//        // Add listeners for other settings similarly
//
//        return view
//    }
//}



import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class SettingsFragment : Fragment() {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchNotifications: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchDarkMode: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchSound: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchAutoPlay: Switch

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        // Initialize SharedPreferences
        sharedPreferences = requireActivity().getSharedPreferences("AppPreferences", Context.MODE_PRIVATE)

        // Bind views
        switchNotifications = view.findViewById(R.id.switch_notifications)
        switchDarkMode = view.findViewById(R.id.switch_dark_mode)
        switchSound = view.findViewById(R.id.switch_sound)
        switchAutoPlay = view.findViewById(R.id.switch_auto_play)

        // Load saved preferences
        loadPreferences()

        // Set listeners for the switches
        switchNotifications.setOnCheckedChangeListener { _, isChecked ->
            savePreference("notifications", isChecked)
        }

        switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            savePreference("dark_mode", isChecked)
            // You can add logic here to change the app theme
        }

        switchSound.setOnCheckedChangeListener { _, isChecked ->
            savePreference("sound", isChecked)
        }

        switchAutoPlay.setOnCheckedChangeListener { _, isChecked ->
            savePreference("auto_play", isChecked)
        }

        return view
    }

    private fun loadPreferences() {
        // Load preferences and set the switch states
        switchNotifications.isChecked = sharedPreferences.getBoolean("notifications", true)
        switchDarkMode.isChecked = sharedPreferences.getBoolean("dark_mode", false)
        switchSound.isChecked = sharedPreferences.getBoolean("sound", true)
        switchAutoPlay.isChecked = sharedPreferences.getBoolean("auto_play", false)
    }

    private fun savePreference(key: String, value: Boolean) {
        // Save the preference to SharedPreferences
        sharedPreferences.edit().putBoolean(key, value).apply()
    }
}





