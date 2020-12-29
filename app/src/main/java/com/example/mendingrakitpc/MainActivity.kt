package com.example.mendingrakitpc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val undiBtn = findViewById<Button>(R.id.undi_btn)
        undiBtn.setOnClickListener {
            undiHasil()
        }
    }

    private fun undiHasil() {
        val undiBtn = findViewById<TextView>(R.id.hasil_undi)
        val hasilUndi = java.util.Random().nextInt(6)+1
        undiBtn.text = hasilUndi.toString()
    }
}