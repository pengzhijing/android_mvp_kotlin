package com.pzj.android_mvp_kotlin.base

/**
 * Created by JeffPeng on 2020/1/8/008.
 * Describe :
 */

data class BaseBean<T>(
    val errorMsg: String,
    val errorCode: Int,
    val data: T
)
