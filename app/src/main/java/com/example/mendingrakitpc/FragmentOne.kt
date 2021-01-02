package com.example.mendingrakitpc

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.FragmentActivity

class FragmentOne : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_one_1)
        //btn color
        setListener()
    }

    private fun setListener() {
        val boxOneText = findViewById<TextView>(R.id.desc_one)
        val boxTwoText = findViewById<TextView>(R.id.desc_two)
        val boxThreeText = findViewById<TextView>(R.id.desc_three)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickText: List<View> =
                listOf(boxOneText,boxTwoText,boxThreeText,rootConstraintLayout)
        for(items in clickText){
            items.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            R.id.desc_one -> view.setBackgroundColor(Color.CYAN)
            R.id.desc_two -> view.setBackgroundColor(Color.BLUE)
            R.id.desc_three -> view.setBackgroundColor(Color.YELLOW)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
