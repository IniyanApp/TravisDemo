package com.task.traviskeygenerate

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


import com.task.traviskeygenerate.BuildConfig;

class MainActivity : AppCompatActivity() {
    var TAG = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview=findViewById<TextView>(R.id.hello)
        val gatewayUrl: String = BuildConfig.GATEWAY_KEY
        val baseUrl: String = BuildConfig.TRAVIS_BASEURL

        textview.setText(""+gatewayUrl+"====="+baseUrl)
        Log.e(TAG, "==encrypted_53cdc6a50984_key=$gatewayUrl")
        Log.e(TAG, "==encrypted_53cdc6a50984_iv=$baseUrl")
    }
}
