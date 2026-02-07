package com.example.laba3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laba3.adapter.TipsAdapter
import com.example.laba3.models.Tip

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TipsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = TipsAdapter(this, getTipsList())
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
    }

    private fun getTipsList(): List<Tip> {
        return listOf(
            Tip(
                id = 1,
                day = 1,
                title = getString(R.string.tip_1_title),
                shortDescription = getString(R.string.tip_1_short),
                fullDescription = getString(R.string.tip_1_full),
                imageResId = R.drawable.ic_tip_1
            ),
            Tip(
                id = 2,
                day = 2,
                title = getString(R.string.tip_2_title),
                shortDescription = getString(R.string.tip_2_short),
                fullDescription = getString(R.string.tip_2_full),
                imageResId = R.drawable.ic_tip_2
            ),
            Tip(
                id = 3,
                day = 3,
                title = getString(R.string.tip_3_title),
                shortDescription = getString(R.string.tip_3_short),
                fullDescription = getString(R.string.tip_3_full),
                imageResId = R.drawable.ic_tip_3
            ),
            Tip(
                id = 4,
                day = 4,
                title = getString(R.string.tip_4_title),
                shortDescription = getString(R.string.tip_4_short),
                fullDescription = getString(R.string.tip_4_full),
                imageResId = R.drawable.ic_tip_4
            ),
            Tip(
                id = 5,
                day = 5,
                title = getString(R.string.tip_5_title),
                shortDescription = getString(R.string.tip_5_short),
                fullDescription = getString(R.string.tip_5_full),
                imageResId = R.drawable.ic_tip_5
            ),
            Tip(
                id = 6,
                day = 6,
                title = getString(R.string.tip_6_title),
                shortDescription = getString(R.string.tip_6_short),
                fullDescription = getString(R.string.tip_6_full),
                imageResId = R.drawable.ic_tip_6
            ),
            Tip(
                id = 7,
                day = 7,
                title = getString(R.string.tip_7_title),
                shortDescription = getString(R.string.tip_7_short),
                fullDescription = getString(R.string.tip_7_full),
                imageResId = R.drawable.ic_tip_7
            ),
            Tip(
                id = 8,
                day = 8,
                title = getString(R.string.tip_8_title),
                shortDescription = getString(R.string.tip_8_short),
                fullDescription = getString(R.string.tip_8_full),
                imageResId = R.drawable.ic_tip_8
            ),
            Tip(
                id = 9,
                day = 9,
                title = getString(R.string.tip_9_title),
                shortDescription = getString(R.string.tip_9_short),
                fullDescription = getString(R.string.tip_9_full),
                imageResId = R.drawable.ic_tip_9
            ),
            Tip(
                id = 10,
                day = 10,
                title = getString(R.string.tip_10_title),
                shortDescription = getString(R.string.tip_10_short),
                fullDescription = getString(R.string.tip_10_full),
                imageResId = R.drawable.ic_tip_10
            ),
            Tip(
                id = 11,
                day = 11,
                title = getString(R.string.tip_11_title),
                shortDescription = getString(R.string.tip_11_short),
                fullDescription = getString(R.string.tip_11_full),
                imageResId = R.drawable.ic_tip_11
            ),
            Tip(
                id = 12,
                day = 12,
                title = getString(R.string.tip_12_title),
                shortDescription = getString(R.string.tip_12_short),
                fullDescription = getString(R.string.tip_12_full),
                imageResId = R.drawable.ic_tip_12
            ),
            Tip(
                id = 13,
                day = 13,
                title = getString(R.string.tip_13_title),
                shortDescription = getString(R.string.tip_13_short),
                fullDescription = getString(R.string.tip_13_full),
                imageResId = R.drawable.ic_tip_13
            ),
            Tip(
                id = 14,
                day = 14,
                title = getString(R.string.tip_14_title),
                shortDescription = getString(R.string.tip_14_short),
                fullDescription = getString(R.string.tip_14_full),
                imageResId = R.drawable.ic_tip_14
            ),
            Tip(
                id = 15,
                day = 15,
                title = getString(R.string.tip_15_title),
                shortDescription = getString(R.string.tip_15_short),
                fullDescription = getString(R.string.tip_15_full),
                imageResId = R.drawable.ic_tip_15
            ),
            Tip(
                id = 16,
                day = 16,
                title = getString(R.string.tip_16_title),
                shortDescription = getString(R.string.tip_16_short),
                fullDescription = getString(R.string.tip_16_full),
                imageResId = R.drawable.ic_tip_16
            ),
            Tip(
                id = 17,
                day = 17,
                title = getString(R.string.tip_17_title),
                shortDescription = getString(R.string.tip_17_short),
                fullDescription = getString(R.string.tip_17_full),
                imageResId = R.drawable.ic_tip_17
            ),
            Tip(
                id = 18,
                day = 18,
                title = getString(R.string.tip_18_title),
                shortDescription = getString(R.string.tip_18_short),
                fullDescription = getString(R.string.tip_18_full),
                imageResId = R.drawable.ic_tip_18
            ),
            Tip(
                id = 19,
                day = 19,
                title = getString(R.string.tip_19_title),
                shortDescription = getString(R.string.tip_19_short),
                fullDescription = getString(R.string.tip_19_full),
                imageResId = R.drawable.ic_tip_19
            ),
            Tip(
                id = 20,
                day = 20,
                title = getString(R.string.tip_20_title),
                shortDescription = getString(R.string.tip_20_short),
                fullDescription = getString(R.string.tip_20_full),
                imageResId = R.drawable.ic_tip_20
            ),
            Tip(
                id = 21,
                day = 21,
                title = getString(R.string.tip_21_title),
                shortDescription = getString(R.string.tip_21_short),
                fullDescription = getString(R.string.tip_21_full),
                imageResId = R.drawable.ic_tip_21
            ),
            Tip(
                id = 22,
                day = 22,
                title = getString(R.string.tip_22_title),
                shortDescription = getString(R.string.tip_22_short),
                fullDescription = getString(R.string.tip_22_full),
                imageResId = R.drawable.ic_tip_22
            ),
            Tip(
                id = 23,
                day = 23,
                title = getString(R.string.tip_23_title),
                shortDescription = getString(R.string.tip_23_short),
                fullDescription = getString(R.string.tip_23_full),
                imageResId = R.drawable.ic_tip_23
            ),
            Tip(
                id = 24,
                day = 24,
                title = getString(R.string.tip_24_title),
                shortDescription = getString(R.string.tip_24_short),
                fullDescription = getString(R.string.tip_24_full),
                imageResId = R.drawable.ic_tip_24
            ),
            Tip(
                id = 25,
                day = 25,
                title = getString(R.string.tip_25_title),
                shortDescription = getString(R.string.tip_25_short),
                fullDescription = getString(R.string.tip_25_full),
                imageResId = R.drawable.ic_tip_25
            ),
            Tip(
                id = 26,
                day = 26,
                title = getString(R.string.tip_26_title),
                shortDescription = getString(R.string.tip_26_short),
                fullDescription = getString(R.string.tip_26_full),
                imageResId = R.drawable.ic_tip_26
            ),
            Tip(
                id = 27,
                day = 27,
                title = getString(R.string.tip_27_title),
                shortDescription = getString(R.string.tip_27_short),
                fullDescription = getString(R.string.tip_27_full),
                imageResId = R.drawable.ic_tip_27
            ),
            Tip(
                id = 28,
                day = 28,
                title = getString(R.string.tip_28_title),
                shortDescription = getString(R.string.tip_28_short),
                fullDescription = getString(R.string.tip_28_full),
                imageResId = R.drawable.ic_tip_28
            ),
            Tip(
                id = 29,
                day = 29,
                title = getString(R.string.tip_29_title),
                shortDescription = getString(R.string.tip_29_short),
                fullDescription = getString(R.string.tip_29_full),
                imageResId = R.drawable.ic_tip_29
            ),
            Tip(
                id = 30,
                day = 30,
                title = getString(R.string.tip_30_title),
                shortDescription = getString(R.string.tip_30_short),
                fullDescription = getString(R.string.tip_30_full),
                imageResId = R.drawable.ic_tip_30
            )
        )
    }
}