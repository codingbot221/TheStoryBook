package com.example.myapplication1000

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController

import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activityvideo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityvideo)


//        val videoView = findViewById<VideoView>(R.id.videoView)
//        val playButton = findViewById<Button>(R.id.playButton)
//
//        // YouTube video link (converted to video URL)
//        val videoUri = Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
//
//        // Set video URI
//        videoView.setVideoURI(videoUri)
//
//        // Play button click listener
//        playButton.setOnClickListener {
//            videoView.start()  // Start video playback
//        }
//
//        // Add listener to restart the video if it finishes playing
//        videoView.setOnCompletionListener {
//            videoView.start()  // Loop the video when it completes
//        }

         val videoView=findViewById<VideoView>(R.id.xml_video_view)
        val packageName = "android.resource://" + getPackageName () + "/" + R.raw.hello
        val uri = Uri.parse(packageName)
        videoView.setVideoURI (uri)
        val mediaController = MediaController(this)
        videoView.setMediaController (mediaController)



    }
}