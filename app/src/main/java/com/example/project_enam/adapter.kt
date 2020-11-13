package com.example.project_enam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class adapter (val phoneItemList: List<phonedata>, val clickListener: (phonedata) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item,parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(phoneItemList[position],clickListener)
    }

    override fun getItemCount()= phoneItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(phone: phonedata, clickListener: (phonedata) -> Unit){
            itemView.item_name.text = phone.kontak
            itemView.part_id.text  = phone.phone.toString()
            itemView.setOnClickListener{clickListener(phone)}
        }

    }
}
