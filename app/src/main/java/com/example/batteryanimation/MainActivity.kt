package com.example.batteryanimation

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view.setBackgroundColor(Color.parseColor("#737373"))

        imageView.setBackgroundResource(R.drawable.gube)
        val ani = imageView.getBackground() as AnimationDrawable
        ani.start()
    }
}
