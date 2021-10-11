package com.example.dinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Banh My","Pho","Bun Bo","My Tom","My Quang","Pizza")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val selectedFoodTxt: TextView = findViewById(R.id.selectedFoodTxt)
        val decideButton: Button = findViewById(R.id.decideBtn)
        val addfoodButton : Button = findViewById(R.id.addfoodBtn)
        val addfoodTxt: EditText = findViewById(R.id.addfoodTxt)
        decideButton.setOnClickListener{
            val random = Random
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }
        addfoodButton.setOnClickListener{
            val newFood = addfoodTxt.text.toString()
            foodList.add(newFood)
            addfoodTxt.text.clear()
            print(foodList)
        }

    }
}