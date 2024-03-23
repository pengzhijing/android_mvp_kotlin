package com.pzj.android_mvp_kotlin.base

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.pzj.android_mvp_kotlin.base.BaseView
import com.yechaoa.yutilskt.YUtils

/**
 * Created by JeffPeng on 2020/1/3/003.
 * Describe :
 */
abstract class BaseActivity : AppCompatActivity(), BaseView {

    //    protected var presenter: P? = null
    protected abstract fun createPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //竖屏
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        setContentView(LayoutInflater.from(this).inflate(getLayoutId(), null))

//        presenter = createPresenter()
//        presenter?.attachView(this)

        createPresenter()

        initView()
    }

    protected fun setMyTitle(title: String) {
        supportActionBar?.title = title
    }

    protected abstract fun getLayoutId(): Int

    protected abstract fun initView()

    override fun showLoading() {
        YUtils.showLoading(this, "加载中")
    }

    override fun hideLoading() {
        YUtils.hideLoading()
    }

    override fun onErrorCode(bean: BaseBean<Any>) {

    }

    /**
     * 统一处理返回键
     */
    protected fun setBackEnabled() {
        supportActionBar?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
    }

    /**
     * 返回键
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
//        presenter?.detachView()
    }

}
