package com.rendyanto.uts201804020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RycleviewCard(private val cardAlmus: ArrayList<varAlMus>): RecyclerView.Adapter<RycleviewCard.CardViewHolder>() {
    inner class  CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var namalmus: TextView = itemView.findViewById(R.id.titleTv)
        var deskalmus: TextView = itemView.findViewById(R.id.DescriptionTV)
        var gamus: ImageView = itemView.findViewById(R.id.alatMusik)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cardAlmus.size
    }

    override fun onBindViewHolder(holder: RycleviewCard.CardViewHolder, position: Int) {
        val cardalmus = cardAlmus[position]
        Glide.with(holder.itemView.context)
            .load(cardalmus.almus)
            .apply (RequestOptions().override(100,100))
            .into(holder.gamus)
        holder.namalmus.text = cardalmus.nambar
        holder.deskalmus.text = cardalmus.deskAlmus
    }
}