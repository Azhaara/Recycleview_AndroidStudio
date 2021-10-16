package com.example.recycleview_azhaara_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailNovelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_novel)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val novel = intent.getParcelableExtra<Novel>(MainActivity.INTENT_PARCELABLE)

        val imgCode = findViewById<ImageView>(R.id.img_item_photo)
        val nameCode = findViewById<TextView>(R.id.tv_item_name)
        val descCode = findViewById<TextView>(R.id.tv_item_description)

        imgCode.setImageResource(novel?.imgNovel!!)
        nameCode.text = novel.nameNovel
        descCode.text = novel.descNovel

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}