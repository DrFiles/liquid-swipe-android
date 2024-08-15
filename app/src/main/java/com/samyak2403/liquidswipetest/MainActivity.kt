/*
 * Created by Samyak kamble on 8/15/24, 10:09 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/15/24, 8:54 PM
 */

package com.samyak2403.liquidswipetest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.samyak2403.liquid_swipe.LiquidPager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<LiquidPager>(R.id.pager)
        pager.adapter = Adapter(supportFragmentManager)
    }
}