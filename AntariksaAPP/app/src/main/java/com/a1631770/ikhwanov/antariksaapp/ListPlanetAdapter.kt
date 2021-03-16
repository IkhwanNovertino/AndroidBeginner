package com.a1631770.ikhwanov.antariksaapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlanetAdapter(private val listPlanet: ArrayList<Planet>) : RecyclerView.Adapter<ListPlanetAdapter.ListViewHolder>() {
  private lateinit var onItemClickCallbaack: OnItemClickCallbaack

  fun setOnItemClickCallback(onItemClickCallbaack: OnItemClickCallbaack){
    this.onItemClickCallbaack = onItemClickCallbaack
  }

  class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tv_item_name)
    var tvDetails = itemView.findViewById<TextView>(R.id.tv_item_detail)
    var imgPhoto = itemView.findViewById<ImageView>(R.id.img_item_photo)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
    val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_planet, parent, false)
    return ListViewHolder(view)
  }

  override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
    val planet = listPlanet[position]

    Glide.with(holder.itemView.context)
        .load(planet.photo)
        .apply(RequestOptions().override(55, 55))
        .into(holder.imgPhoto)

    holder.tvName.text = planet.name
    holder.tvDetails.text = planet.detail
    holder.itemView.setOnClickListener { onItemClickCallbaack.onItemClicked(listPlanet[holder.adapterPosition]) }
  }

  override fun getItemCount(): Int {
    return listPlanet.size
  }

  interface OnItemClickCallbaack {
    fun onItemClicked(data: Planet)
  }
}