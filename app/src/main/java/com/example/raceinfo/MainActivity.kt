package com.example.raceinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_book.setOnClickListener {
            val intent = Intent(this, buku1::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener {
            val intent = Intent( this, home1::class.java)
            startActivity(intent)
        }

        btn_info.setOnClickListener {
            val intent = Intent( this, info1::class.java)
            startActivity(intent)
        }
    }
}
