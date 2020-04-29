package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycleview_layout.view.*

class RecyclerViewAdapter (private val items: MutableList<ItemModel>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
            R.layout.item_recycleview_layout,
            parent,
            false)) // აბრუნებს ობიექტს ვიუჰოლდერის ტიპის
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind()
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private lateinit var model: ItemModel

        fun onBind(){
            model = items[adapterPosition]
            itemView.imageView.setImageResource(model.image)
            itemView.titleTextView.text = model.title
            itemView.descriptionTextView.text = model.description
            itemView.authorTextView.text = model.author
        }
    }
}