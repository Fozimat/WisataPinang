package com.fozimat.wisatapinang

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fozimat.wisatapinang.databinding.ItemRowWisataBinding

class ListWisataAdapter(private val listWisata: ArrayList<Wisata>) : RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(var binding: ItemRowWisataBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowWisataBinding.inflate(LayoutInflater.from(viewGroup. context), viewGroup, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .apply(RequestOptions().override(200,200))
            .into(holder.binding.imgItemPhoto)

        holder.binding.tvItemName.text = wisata.name
        holder.binding.tvItemDetail.text = wisata.detail

        holder.binding.btnFav.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Favorite " + listWisata[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

        holder.binding.btnShare.setOnClickListener {
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