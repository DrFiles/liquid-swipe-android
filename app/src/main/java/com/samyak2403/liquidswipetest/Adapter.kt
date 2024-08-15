/*
 * Created by Samyak kamble on 8/15/24, 10:04 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/15/24, 10:04 PM
 */

package com.samyak2403.liquidswipetest

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    private val total: Int = 6
    private val data : ArrayList<PageFragment> = ArrayList(total)

    init {
        for (i in 0 until total) {
            val fragment = PageFragment()
            val bundle = Bundle()
            bundle.putInt("POSITION", i+1)
            fragment.arguments = bundle
            data.add(fragment)
        }
    }


    override fun getItem(position: Int): Fragment {
        return data[position]
    }

    override fun getCount(): Int {
        return total
    }
}
