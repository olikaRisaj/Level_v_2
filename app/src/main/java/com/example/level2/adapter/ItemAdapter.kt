package com.example.level2.adapter

import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.text.style.BackgroundColorSpan
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.level2.R
import com.example.level2.databinding.SingleItemBinding
import com.example.level2.model.ContactData
import com.example.level2.utils.ext.loadImage
import com.squareup.picasso.Picasso

class ItemAdapter(var dataset: MutableList<ContactData>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SingleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(dataset.get(position)) {
                binding.contactNameTextview.text = this.contactName
                binding.contactProfessionTextview.text = this.contactProfession
                binding.contactPhotoImageview.loadImage(this.contactPhotoUrl)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    fun deleteContact(position: Int) {
        dataset.removeAt(position)
        notifyItemRemoved(position)
    }

    inner class ViewHolder(val binding: SingleItemBinding): RecyclerView.ViewHolder(binding.root)
}

