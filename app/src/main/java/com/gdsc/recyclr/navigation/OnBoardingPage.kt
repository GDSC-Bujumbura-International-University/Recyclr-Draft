@file:Suppress("unused")

package com.gdsc.recyclr.navigation

import androidx.annotation.DrawableRes
import com.gdsc.recyclr.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String)
{
    object First : OnBoardingPage(
        image = R.drawable.splash_image_1,
        title = "Let's start protecting our environment",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

    object Second : OnBoardingPage(
        image = R.drawable.splash_image_2,
        title = "Scan the waste",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

    object Third : OnBoardingPage(
        image = R.drawable.splash_image_3,
        title = "Earn and plant a tree",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

}

