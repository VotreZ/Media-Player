package com.example.service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/jeje.lombok"))
            startActivity(i)
        })

        ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/jeje_deavin"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.afterlife)

        play.setOnClickListener {
            MediaPlayer?.start()
        }

        pause.setOnClickListener {
            MediaPlayer?.pause()
        }

        stop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
