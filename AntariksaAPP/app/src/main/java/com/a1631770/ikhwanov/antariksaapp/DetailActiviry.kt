package com.a1631770.ikhwanov.antariksaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActiviry : AppCompatActivity() {

  companion object{
    const val EXTRA_NAME = "extra_name"
    const val EXTRA_DETAIL = "extra_detail"
    const val EXTRA_PHOTO = "extra_photo"
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail_activiry)

    val imgPhoto: ImageView = findViewById(R.id.img_photo)
    val tvName: TextView = findViewById(R.id.tv_name)
    val tvDetail: TextView = findViewById(R.id.tv_detail)
    val btnFavorite: Button = findViewById(R.id.btn_favorite)
    val btnShare: Button = findViewById(R.id.btn_share)

    val name = intent.getStringExtra(EXTRA_NAME)
    val detail = intent.getStringExtra(EXTRA_DETAIL)
    val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

    imgPhoto.setImageResource(photo)
    tvName.text = name
    tvDetail.text = detail

    btnFavorite.setOnClickListener {
      Toast.makeText(this, "Favorite " + name, Toast.LENGTH_SHORT).show()
    }

    btnShare.setOnClickListener {
      Toast.makeText(this, "Share " + name, Toast.LENGTH_SHORT).show()
    }

  }
}