package com.rendyanto.uts201804020

import java.util.ArrayList

object dataAlatMusik {
    private val namabarang = arrayOf(
        "A01",
        "A02",
        "A03",
        "A04",
        "A05",
        "A06")
    private val deskripsi =  arrayOf(
        "Rp.500000",
        "Rp.600000",
        "Rp.1000000",
        "Rp.150000",
        "Rp.200000",
        "Rp.100000")
    private val alatmusik = intArrayOf(R.drawable.gitar,R.drawable.bass,R.drawable.pianos,R.drawable.harmonika,R.drawable.jimbe,R.drawable.seruling)
    val rycledata: ArrayList<varAlMus>
        get() {
            val listtanaman = arrayListOf<varAlMus>()
            for (position in namabarang.indices){
                val almus = varAlMus()
                almus.nambar = namabarang[position]
                almus.deskAlmus = deskripsi[position]
                almus.almus = alatmusik[position]
                listtanaman.add(almus)
            }
            return listtanaman
        }
}