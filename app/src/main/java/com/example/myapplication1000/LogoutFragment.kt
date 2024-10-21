package com.example.myapplication1000



import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class LogoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_logout, container, false)

        // Initialize UI components
        val yesButton: Button = view.findViewById(R.id.btn_yes)
        val noButton: Button = view.findViewById(R.id.btn_no)

        // Yes button: Log out and navigate to LoginActivity
        yesButton.setOnClickListener {
            val intent = Intent(activity, LoginActivity::class.java)
            // Clear the back stack and start LoginActivity as a new task
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            activity?.finish() // Close the current activity
        }

        // No button: Close the fragment and return to the previous screen
        noButton.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack() // Pop fragment back stack
        }

        return view
    }
}
