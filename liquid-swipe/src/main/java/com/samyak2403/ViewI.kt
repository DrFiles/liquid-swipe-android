/*
 * Created by Samyak kamble on 8/15/24, 9:38 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/15/24, 9:38 PM
 */

package com.samyak2403

import android.graphics.Bitmap

interface ViewI {
    fun getBitmap(direction: Int) : Bitmap?
    fun getBitmapAt(position: Int) : Bitmap?
    fun getCount(): Int
    fun redraw()
    fun switchPage(direction: Int)
    fun getCurrentItem(): Int
    fun blockInput(block: Boolean)
}