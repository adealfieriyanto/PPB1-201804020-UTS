package com.rendyanto.uts201804020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class alatmusik : AppCompatActivity() {
    private lateinit var rvAlatMusik: RecyclerView
    private var list: ArrayList<varAlMus> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alatmusik)

        rvAlatMusik = findViewById(R.id.recyleview)
        rvAlatMusik.setHasFixedSize(true)

        list.addAll(dataAlatMusik.rycledata)
        showRecylerViewListMode()
    }
    private fun showRecylerViewListMode(){
        rvAlatMusik.layoutManager = LinearLayoutManager(this)
        val listTanamanAdapter = RycleviewCard(list)
        rvAlatMusik.adapter = listTanamanAdapter
    }
}