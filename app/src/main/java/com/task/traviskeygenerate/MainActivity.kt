package com.task.traviskeygenerate

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


import com.task.traviskeygenerate.BuildConfig;

class MainActivity : AppCompatActivity() {
    var TAG = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val gatewayUrl: String = BuildConfig.GATEWAY_KEY
        val baseUrl: String = BuildConfig.TRAVIS_BASEURL

        Log.e(TAG, "==gateway=$gatewayUrl")
        Log.e(TAG, "==baseUrl=$baseUrl")
    }
}
