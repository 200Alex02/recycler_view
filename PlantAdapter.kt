package com.example.recycler_view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycler_view.databinding.ItemPlantsBinding

class PlantAdapter(private val plants: List<Plant>) :
    RecyclerView.Adapter<PlantAdapter.PlantHolder>() {

    class PlantHolder(item: View) : RecyclerView.ViewHolder(item) {
        val imageView: ImageView = item.findViewById(R.id.imageView)
        val namePlant: TextView = item.findViewById(R.id.name_plant)
        val typePlant: TextView = item.findViewById(R.id.type_of_plant)
        val colorPlant: TextView = item.findViewById(R.id.leaf_color)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_plants, parent, false)
        return PlantHolder(view)
    }

    override fun getItemCount(): Int = plants.size

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        val plant = plants[position]
        Glide.with(holder.itemView)
            .load(plant.photo)
            .circleCrop()
            .error(R.drawable.error)
            .placeholder(R.drawable.error)
            .into(holder.imageView)
        holder.colorPlant.text = plant.color
        holder.namePlant.text = plant.name
        holder.typePlant.text = plant.type

    }

}