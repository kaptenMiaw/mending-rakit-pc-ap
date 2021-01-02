package com.example.mendingrakitpc

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
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
        val headerText = findViewById<TextView>(R.id.header_title)
        val pcText = findViewById<TextView>(R.id.pc_list)
        val boxOneText = findViewById<TextView>(R.id.desc_one)
        val boxTwoText = findViewById<TextView>(R.id.desc_two)
        val boxThreeText = findViewById<TextView>(R.id.desc_three)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val btnOne = findViewById<Button>(R.id.btn_one)
        val btnTwo = findViewById<Button>(R.id.btn_two)
        val btnThree = findViewById<Button>(R.id.btn_three)

        val clickText: List<View> =
                listOf(boxOneText,boxTwoText,boxThreeText,rootConstraintLayout,
                    btnOne,btnTwo,btnThree,pcText,headerText)
        for(items in clickText){
            items.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            R.id.desc_one -> view.setBackgroundColor(Color.CYAN)
            R.id.desc_two -> view.setBackgroundColor(Color.BLUE)
            R.id.desc_three -> view.setBackgroundColor(Color.GREEN)
            R.id.pc_list -> view.setBackgroundResource(R.drawable.dice_1)
            R.id.header_title -> view.setBackgroundColor(Color.RED)
            R.id.btn_one -> view.setBackgroundColor(Color.BLUE)
            R.id.btn_two -> view.setBackgroundColor(Color.MAGENTA)
            R.id.btn_three -> view.setBackgroundColor(Color.RED)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
