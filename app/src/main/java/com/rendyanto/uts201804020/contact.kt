package com.rendyanto.uts201804020

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact.*

class contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        btn_call.setOnClickListener {
            val panggil = t_nmr.text.toString()
            val Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$panggil"))
            startActivity(Dial)
        }
    }
}