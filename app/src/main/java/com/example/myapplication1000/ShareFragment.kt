package com.example.myapplication1000

//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//
//
//class ShareFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_share, container, false)
//    }
//
//
//}




import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class ShareFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_share, container, false)

        val linkedinLogo = view.findViewById<ImageView>(R.id.linkedin_logo)
        val instagramLogo = view.findViewById<ImageView>(R.id.instagram_logo)
        val whatsappLogo = view.findViewById<ImageView>(R.id.whatsapp_logo)
        val facebookLogo = view.findViewById<ImageView>(R.id.facebook_logo)
        val contactUsLogo = view.findViewById<ImageView>(R.id.contact_us_logo)

        linkedinLogo.setOnClickListener {
            openApp("com.linkedin.android", "https://www.linkedin.com/in/aishwarya-garikapati-008648276/")
        }

        instagramLogo.setOnClickListener {
            openApp("com.instagram.android", "https://www.instagram.com/aishwarya.g___/")
        }

        whatsappLogo.setOnClickListener {
            openApp("com.whatsapp", "https://www.whatsapp.com")
        }

        facebookLogo.setOnClickListener {
            openApp("com.facebook.katana", "https://www.facebook.com")
        }

        contactUsLogo.setOnClickListener {
            dialPhoneNumber("8328022600")
        }

        return view
    }

    private fun openApp(packageName: String, webUrl: String) {
        val intent = requireActivity().packageManager.getLaunchIntentForPackage(packageName)
        if (intent != null) {
            startActivity(intent)
        } else {
            try {
                val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(webUrl))
                startActivity(webIntent)
            } catch (e: ActivityNotFoundException) {
                e.printStackTrace()
            }
        }
    }

    private fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phoneNumber")
        startActivity(intent)
    }
}
