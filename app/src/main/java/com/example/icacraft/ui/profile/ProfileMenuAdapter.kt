package com.example.icacraft.ui.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.icacraft.R
import com.example.icacraft.model.dummy.ProfileMenuModel
import kotlinx.android.synthetic.main.item_menu_profile.view.*

class ProfileMenuAdapter (
    private val listData : List<ProfileMenuModel>,
    private val itemAdapterCallbak : ItemAdapterCallback,
) : RecyclerView.Adapter<ProfileMenuAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileMenuAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_menu_profile, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileMenuAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallbak)
    }

    override fun getItemCount(): Int {
        return listData.size
    }


    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(data: ProfileMenuModel, itemAdapterCallbak: ItemAdapterCallback) {
            itemView.apply {
                tvTitle.text = data.title

                setOnClickListener { itemAdapterCallbak.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data: ProfileMenuModel)
    }


}