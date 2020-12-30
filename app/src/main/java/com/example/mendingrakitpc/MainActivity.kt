package com.example.mendingrakitpc

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentActivity

lateinit var hadiahUndi: ImageView

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val undiBtn = findViewById<Button>(R.id.undi_btn)
        undiBtn.setOnClickListener {
            undiHasil()
        }
        hadiahUndi = findViewById(R.id.hadiah_ic)
    }

    private fun undiHasil() {
        val hasilUndi = java.util.Random().nextInt(6)+1
        val gambarHadiah = when(hasilUndi){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        hadiahUndi.setImageResource(gambarHadiah)
    }
}