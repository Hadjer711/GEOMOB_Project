package com.example.geomob.UTILS


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.geomob.BD.Historique

import com.example.geomob.BD.Ressource
import com.example.geomob.R
import kotlinx.android.synthetic.main.layout_historique_list_item.view.*
import kotlin.collections.ArrayList


class  HistoriqueAdapter(var clickListner: OnHistoriqueListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<Historique> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return historiqueViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_historique_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is historiqueViewHolder -> {
                holder.bind(items.get(position), clickListner)
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(historique: List<Historique>){
        items = historique
    }

    class historiqueViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val historique_date = itemView.historique_date
        val historique_description = itemView.historique_description


        fun bind(historique: Historique, action: OnHistoriqueListener){


            historique_date.setText(historique.date)
            historique_description.setText(historique.description)


            itemView.setOnClickListener{
                action.onHistoriqueClick(historique, adapterPosition )
            }

        }



    }

    public interface OnHistoriqueListener {
        fun onHistoriqueClick(historique: Historique, position: Int)
    }

}