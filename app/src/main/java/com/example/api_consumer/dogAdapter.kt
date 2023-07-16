package com.example.api_consumer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class dogAdapter(val images: List<String>) : RecyclerView.Adapter<dogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return dogViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun onBindViewHolder(holder: dogViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size
}