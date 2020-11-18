package com.rendyanto.uts201804020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val web:WebView = findViewById(R.id.web)
        web.settings.javaScriptEnabled = true
        web.loadUrl("file:///android_asset/adealfi/uas.html")
    }
}