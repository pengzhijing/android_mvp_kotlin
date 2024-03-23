package com.pzj.android_mvp_kotlin.bean

/**
 * Created by JeffPeng on 2020/1/19/019.
 * Describe :
 */
data class Banner(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
)