package com.example.laba3.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laba3.R
import com.example.laba3.TipDetailActivity
import com.example.laba3.models.Tip
import com.google.android.material.card.MaterialCardView

class TipsAdapter(
    private val context: Context,
    private var tips: List<Tip> = emptyList()
) : RecyclerView.Adapter<TipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]
        holder.bind(tip)

        // Обработка клика
        holder.itemView.findViewById<MaterialCardView>(R.id.cardView).setOnClickListener {
            val intent = Intent(context, TipDetailActivity::class.java).apply {
                putExtra("tip_id", tip.id)
                putExtra("tip_day", tip.day)
                putExtra("tip_title", tip.title)
                putExtra("tip_full_description", tip.fullDescription)
                putExtra("tip_image_res", tip.imageResId)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = tips.size

    fun updateTips(newTips: List<Tip>) {
        tips = newTips
        notifyDataSetChanged()
    }
}