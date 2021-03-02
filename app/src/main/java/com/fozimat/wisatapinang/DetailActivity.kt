package com.fozimat.wisatapinang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val tvPhoto: ImageView = findViewById(R.id.tv_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(600, 600))
            .into(tvPhoto)

        tvName.text = "Nama : $name"
        tvDetail.text = "Detail : $detail"
    }
}