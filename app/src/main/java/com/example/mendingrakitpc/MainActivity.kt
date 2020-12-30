package com.example.mendingrakitpc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentActivity

//next button
lateinit var hadiahUndi: ImageView
//image hadiah
lateinit var nextBtn : Button

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val undiBtn = findViewById<Button>(R.id.undi_btn)
        undiBtn.setOnClickListener {
            undiHasil()
        }
        //this is for next intent
        nextBtn = findViewById(R.id.next_btn1)
        nextBtn.setOnClickListener {
            val nextPage = Intent(this,FragmentOne::class.java)
            startActivity(nextPage)
        }
        //this is for hadiah image
        hadiahUndi = findViewById(R.id.hadiah_ic)
    }

    private fun undiHasil() {
        val gambarHadiah = when(java.util.Random().nextInt(6)+1){
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