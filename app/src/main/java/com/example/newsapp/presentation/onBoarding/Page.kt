package com.example.newsapp.presentation.onBoarding

import androidx.annotation.DrawableRes

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)

val pages= listOf(
    Page(
        title = "First Page",
        description = "First Page Description",
        image = com.example.newsapp.R.drawable.onboarding1
    ),
    Page(
        title = "Second Page",
        description = "Second Page Description",
        image = com.example.newsapp.R.drawable.onboarding2
    ),
    Page(
        title = "Third Page",
        description = "Third Page Description",
        image = com.example.newsapp.R.drawable.onboarding3
    )
)