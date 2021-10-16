package com.example.recycleview_azhaara_06

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NovelAdapter(private val context: Context, private val novel: List<Novel>, val listener: (Novel) -> Unit)
    : RecyclerView.Adapter<NovelAdapter.NovelViewHolder>(){

    class NovelViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgNovel = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameNovel = view.findViewById<TextView>(R.id.tv_item_name)
        val descNovel = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(code: Novel, listener: (Novel) -> Unit) {
            imgNovel.setImageResource(code.imgNovel)
            nameNovel.text = code.nameNovel
            descNovel.text = code.descNovel
            itemView.setOnClickListener{
                listener(code)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NovelViewHolder {
        return NovelViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_novel, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NovelViewHolder, position: Int) {
        holder.bindView(novel[position], listener)
    }

    override fun getItemCount(): Int = novel.size
}