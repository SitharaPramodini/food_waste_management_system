package com.faste.foodwastemanageapp.recipes.direction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.faste.foodwastemanageapp.R

class RecipeDirectionActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_direction)

            val bundle :Bundle?=intent.extras

            val directions = bundle!!.getString("directions")

            val directionTxt = findViewById<TextView>(R.id.directionTxt)
            directionTxt.text = directions
    }
}