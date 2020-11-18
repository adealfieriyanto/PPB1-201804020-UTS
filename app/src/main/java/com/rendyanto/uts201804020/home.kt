package com.rendyanto.uts201804020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnprofil.setOnClickListener{
            startActivity(Intent(this, profil::class.java))
        }
        btnrecyleview.setOnClickListener{
            startActivity(Intent(this, alatmusik::class.java))
        }
        btnweb.setOnClickListener{
            startActivity(Intent(this, web::class.java))
        }
        btncp.setOnClickListener{
            startActivity(Intent(this, contact::class.java))
        }
    }
}