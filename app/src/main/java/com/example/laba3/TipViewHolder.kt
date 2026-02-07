package com.example.laba3.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laba3.R
import com.example.laba3.models.Tip

class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val dayTextView: TextView = itemView.findViewById(R.id.dayTextView)
    private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    private val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
    private val tipImageView: ImageView = itemView.findViewById(R.id.tipImageView)

    fun bind(tip: Tip) {
        dayTextView.text = itemView.context.getString(R.string.day_format, tip.day)
        titleTextView.text = tip.title
        descriptionTextView.text = tip.shortDescription
        tipImageView.setImageResource(tip.imageResId)
    }
}