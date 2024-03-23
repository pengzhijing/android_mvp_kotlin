package com.pzj.android_mvp_kotlin.app

import android.app.Application
import com.yechaoa.yutilskt.ActivityUtil
import com.yechaoa.yutilskt.LogUtil
import com.yechaoa.yutilskt.YUtils

/**
 *Created by JeffPeng on 2024/03/20
 */
class App:Application() {
    override fun onCreate() {
        super.onCreate()
        YUtils.init(this)
        LogUtil.setIsLog(true)
        registerActivityLifecycleCallbacks(ActivityUtil.activityLifecycleCallbacks)
    }
}