package com.example.level2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.level2.databinding.SingleItemBinding
import com.example.level2.model.ContactData

class ItemAdapter(var dataset: List<ContactData>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SingleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(dataset[position]) {
                binding.contactNameTextview.text = this.contactName
                binding.contactProfessionTextview.text = this.contactProfession
                // create extension function to load photo with fun binding.contactPhotoImageView.load
                // using Picasso and Glide
                Glide.with(binding.contactPhotoImageview)
                    .load(this.contactPhotoUrl)
                    .into(binding.contactPhotoImageview)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    inner class ViewHolder(val binding: SingleItemBinding): RecyclerView.ViewHolder(binding.root)
}

