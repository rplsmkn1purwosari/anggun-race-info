package com.example.raceinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_buku1.*

class buku1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buku1)

        Lari_ku.setOnClickListener {
            val intent = Intent (this, lari::class.java)
            startActivity(intent)
        }

        lompat_jauh.setOnClickListener {
            val intent =  Intent ( this, lompatjauhku::class.java)
            startActivity(intent)
        }

        pencak_silat.setOnClickListener {
            val intent = Intent (this, pencaksilatku::class.java)
            startActivity(intent)
        }

        Taekwondoo.setOnClickListener {
            val intent = Intent (this, taekwondoku::class.java)
            startActivity(intent)
        }

        Renang.setOnClickListener {
            val intent = Intent (this, renang::class.java)
            startActivity(intent)
        }
    }
}
