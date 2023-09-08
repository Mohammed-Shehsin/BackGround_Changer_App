package com.shehsin0.bgselecterapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val txtRes = findViewById<TextView>(R.id.TxtView)
        val view = findViewById<View>(R.id.view2)
        val intent = getIntent()
        val color = intent.getStringExtra("Color")

        val backgroundColor = when (color) {
            "RED" -> Color.RED
            "BLUE" -> Color.BLUE
            "YELLOW" -> Color.YELLOW
            "GREEN" -> Color.GREEN
            "BLACK" -> Color.BLACK
            else -> Color.WHITE
        }
        view.setBackgroundColor(backgroundColor)
        txtRes.text = color
    }
}