package com.shehsin0.bgselecterapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRed = findViewById<Button>(R.id.btnRed)
        val btnBlue = findViewById<Button>(R.id.btnBlue)
        val btnGreen = findViewById<Button>(R.id.btnGreen)
        val btnYellow = findViewById<Button>(R.id.btnYellow)
        val btnBlack = findViewById<Button>(R.id.btnBlack)
        btnBlue.setBackgroundColor(Color.BLUE)
        btnBlack.setBackgroundColor(Color.BLACK)
        btnRed.setBackgroundColor(Color.RED)
        btnGreen.setBackgroundColor(Color.GREEN)
        btnYellow.setBackgroundColor(Color.YELLOW)


        btnRed.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Color","RED")
            startActivity(intent)
        }

        btnBlue.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Color","BLUE")
            startActivity(intent)
        }

        btnGreen.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Color","GREEN")
            startActivity(intent)
        }

        btnYellow.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Color","YELLOW")
            startActivity(intent)
        }

        btnBlack.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Color","BLACK")
            startActivity(intent)
        }

    }
}