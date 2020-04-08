package com.hussein.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hussein.startup.R.id.*
import kotlinx.android.synthetic.main.activity_food_details.*



class FoodDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        val bundle=intent.extras

        ivFoodImage.setImageResource(bundle.getInt("image"))
        tvName.text = bundle.getString("name")
        tvDetails.text = bundle.getString("des")
        
        

    }
}
