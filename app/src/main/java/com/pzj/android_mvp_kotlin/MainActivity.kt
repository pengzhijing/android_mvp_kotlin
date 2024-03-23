package com.pzj.android_mvp_kotlin

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.pzj.android_mvp_kotlin.databinding.ActivityMainBinding

/**
 *Created by JeffPeng on 2024/03/19
 */
class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }
}