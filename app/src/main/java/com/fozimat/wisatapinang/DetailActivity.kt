package com.fozimat.wisatapinang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fozimat.wisatapinang.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(600, 600))
            .into(binding.tvPhoto)

        binding.tvName.text = name
        binding.tvDetail.text = detail
    }
}