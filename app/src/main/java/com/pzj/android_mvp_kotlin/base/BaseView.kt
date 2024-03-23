package com.pzj.android_mvp_kotlin.base


/**
 * Created by JeffPeng on 2020/1/9/009.
 * Describe :
 */
interface BaseView {

    fun showLoading()

    fun hideLoading()

    fun onErrorCode(bean: BaseBean<Any>)

}