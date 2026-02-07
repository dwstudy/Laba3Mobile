package com.example.laba3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TipDetailActivity : AppCompatActivity() {

    private lateinit var dayTextView: TextView
    private lateinit var titleTextView: TextView
    private lateinit var fullDescriptionTextView: TextView
    private lateinit var tipImageView: ImageView
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_detail)

        // Инициализация View через findViewById
        dayTextView = findViewById(R.id.dayTextView)
        titleTextView = findViewById(R.id.titleTextView)
        fullDescriptionTextView = findViewById(R.id.fullDescriptionTextView)
        tipImageView = findViewById(R.id.tipImageView)
        backButton = findViewById(R.id.backButton)

        // Получаем данные из Intent
        val day = intent.getIntExtra("tip_day", 1)
        val title = intent.getStringExtra("tip_title") ?: ""
        val fullDescription = intent.getStringExtra("tip_full_description") ?: ""
        val imageRes = intent.getIntExtra("tip_image_res", R.drawable.ic_tip_1)

        // Устанавливаем данные
        dayTextView.text = getString(R.string.day_format, day)
        titleTextView.text = title
        fullDescriptionTextView.text = fullDescription
        tipImageView.setImageResource(imageRes)

        // Настройка кнопки назад
        backButton.setOnClickListener {
            finish()
        }
    }
}