package com.fozimat.wisatapinang

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListWisataAdapter(private val listWisata: ArrayList<Wisata>) : RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnFav: Button = itemView.findViewById(R.id.btn_fav)
        var btnShare: Button = itemView.findViewById(R.id.btn_share)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_wisata, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .apply(RequestOptions().override(200,200))
            .into(holder.imgPhoto)

        holder.tvName.text = wisata.name
        holder.tvDetail.text = wisata.detail

        holder.btnFav.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Favorite " + listWisata[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listWisata[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listWisata[holder.adapterPosition])
            val moveToDetail = Intent(holder.itemView.context, DetailActivity::class.java)
            moveToDetail.putExtra(DetailActivity.EXTRA_NAME, wisata.name)
            moveToDetail.putExtra(DetailActivity.EXTRA_DETAIL, wisata.detail)
            moveToDetail.putExtra(DetailActivity.EXTRA_PHOTO, wisata.photo)
            holder.itemView.context.startActivity(moveToDetail)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Wisata)
    }



}