package com.example.level2.utils.ext

import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide


fun AppCompatImageView.loadImage(imgUrl: String) {
    Glide.with(this)
        .load(imgUrl)
        .circleCrop()
        .into(this)
}
