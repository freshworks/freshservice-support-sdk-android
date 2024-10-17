package com.example.freshservicesupportsdk

import android.app.Application
import android.graphics.Color
import com.freshworks.sdk.freshservicesupportsdk.FSSupport

class FSSupportSDKApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeFSSupportSDK()
    }

    private fun initializeFSSupportSDK() {
        val config = FSSupport.Config(
            themeColor =  Color.parseColor("#FF0000"), // Apply your theme color here
            enableDarkMode = false // Enable dark mode
        )
        FSSupport.initialize(
            context = applicationContext, // Application context
            domain = "", // Your Freshservice domain
            userToken = "", // Your user token
            slug = "", // Your Freshservice slug
            config = config // SDK configuration
        )
    }
}