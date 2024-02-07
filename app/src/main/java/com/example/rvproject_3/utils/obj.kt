package com.example.rvproject_3.utils

import com.example.rvproject_3.R
import com.example.rvproject_3.models.Images

object obj {
    val list = ArrayList<Images>()
    fun addList(){
        for (i in 0 .. 10){
            list.add(Images(R.drawable.item_image_1,"rawpixel.com"))
            list.add(Images(R.drawable.item_image_2,"rawpixel.com"))
            list.add(Images(R.drawable.item_image_3,"Elvis"))
            list.add(Images(R.drawable.item_image_4,"Elvis"))
            list.add(Images(R.drawable.item_image_4,"rawpixel.com"))
            list.add(Images(R.drawable.item_image_6,"rawpixel.com"))
        }
    }
}