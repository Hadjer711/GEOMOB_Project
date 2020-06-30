package com.example.geomob.UTILS


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.geomob.BD.Personnalite
import com.example.geomob.R
import kotlinx.android.synthetic.main.layout_personnalite_list_item.view.*
import kotlin.collections.ArrayList


class  PersonnaliteAdapter(var clickListner: OnPersonnaliteListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<Personnalite> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LivreViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_personnalite_list_item,
                parent,
                false
            )
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

    fun submitList(personnalite: List<Personnalite>){
        items = personnalite
    }

    class LivreViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val personnalite_nom = itemView.personnalite_nom
        val personnalite_image = itemView.personnalite_image
        val personnalite_description = itemView.personnalite_description

        fun bind(personnalite: Personnalite, action: OnPersonnaliteListener){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(personnalite.image)
                .into(personnalite_image)
            personnalite_nom.setText(personnalite.nom)
            personnalite_description.setText(personnalite.description)

            itemView.setOnClickListener{
                action.onPersonnaliteClick(personnalite, adapterPosition )
            }

        }



    }

    public interface OnPersonnaliteListener {
        fun onPersonnaliteClick(personnalite: Personnalite, position: Int)
    }

}