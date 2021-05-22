package com.example.icacraft.ui.home.newarrival

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.icacraft.R
import com.example.icacraft.model.dummy.HomeVerticalModel
import com.example.icacraft.utils.Helpers.formatPrice
import kotlinx.android.synthetic.main.item_home_vertical.view.*

class HomeNewArrivalAdapter (
    private val listData : List<HomeVerticalModel>,
    private val itemAdapterCallbak : ItemAdapterCallback,
) : RecyclerView.Adapter<HomeNewArrivalAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeNewArrivalAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeNewArrivalAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallbak)
    }

    override fun getItemCount(): Int {
        return listData.size
    }


    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(data: HomeVerticalModel, itemAdapterCallbak: ItemAdapterCallback) {
            itemView.apply {
                tvTitle.text = data.title
                tvPrice.formatPrice(data.price)
                rbCraft.rating = data.rating

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPoster)

                setOnClickListener { itemAdapterCallbak.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:HomeVerticalModel)
    }


}