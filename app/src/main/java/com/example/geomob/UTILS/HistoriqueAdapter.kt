package com.example.geomob.UTILS


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.geomob.BD.Ressource
import com.example.geomob.R
import kotlinx.android.synthetic.main.layout_ressource_list_item.view.*
import kotlin.collections.ArrayList


class  HistoriqueAdapter(var clickListner: OnRessourceListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<Ressource> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ressourceViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_ressource_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is ressourceViewHolder -> {
                holder.bind(items.get(position), clickListner)
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(ressource: List<Ressource>){
        items = ressource
    }

    class ressourceViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val ressource_nom = itemView.ressouce_nom
        val ressource_type = itemView.ressource_type
        val ressource_quantite = itemView.ressource_quantite

        fun bind(ressource: Ressource, action: OnRessourceListener){


            ressource_nom.setText(ressource.nom)
            ressource_quantite.setText(ressource.quantite)
            ressource_type.setText(ressource.type)

            itemView.setOnClickListener{
                action.onRessourceClick(ressource, adapterPosition )
            }

        }



    }

    public interface OnRessourceListener {
        fun onRessourceClick(ressource: Ressource, position: Int)
    }

}