package com.example.geomob


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_pays_list_item.view.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlin.collections.ArrayList


class  PaysAdapter(var clickListner: OnLivreListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<Pays> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LivreViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_pays_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is LivreViewHolder -> {
                holder.bind(items.get(position), clickListner)
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(pays: List<Pays>){
        items = pays
    }

    class LivreViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val pays_drapeau = itemView.pays_drapeau
        val pays_nom = itemView.pays_nom
        val pays_description = itemView.pays_description

        fun bind(pays: Pays, action: OnLivreListener){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(pays.drapeau)
                .into(pays_drapeau)
           pays_nom.setText(pays.nom)
            pays_description.setText(pays.description)

            itemView.setOnClickListener{
                action.onLivreClick(pays, adapterPosition )
            }

        }



    }

    public interface OnLivreListener {
        fun onLivreClick(pays: Pays, position: Int)
    }

}