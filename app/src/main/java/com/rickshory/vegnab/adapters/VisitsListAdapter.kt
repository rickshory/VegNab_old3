package com.rickshory.vegnab.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.visit_list_item.view.*

class VisitsListAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<VisitsListAdapter.VisitsViewHolder>() {


    inner class VisitsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameItemView: TextView = itemView.vli_name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VisitsViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: VisitsViewHolder, position: Int, payloads: MutableList<Any>) {
        super.onBindViewHolder(holder, position, payloads)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}