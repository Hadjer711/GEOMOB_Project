package com.example.geomob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.geomob.BD.Ressource
import com.example.geomob.UTILS.HistoriqueAdapter
import com.example.geomob.UTILS.HistoriqueAdapter.OnRessourceListener
import com.example.geomob.UTILS.PaysAdapter
import kotlinx.android.synthetic.main.activity_main.*

class HistoriqueActivity : AppCompatActivity() , OnRessourceListener{

    var toolbar: Toolbar? = null
    private lateinit var historiqueAdapter: HistoriqueAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historique)
        toolbar=findViewById(R.id.toolbar)

        initRecycleView()
    }


    private fun initRecycleView(){
        recycleview. apply {
            layoutManager= LinearLayoutManager(this@HistoriqueActivity)
            val topSpacingItemDecoration= TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingItemDecoration)
            historiqueAdapter= HistoriqueAdapter(this@HistoriqueActivity)
            adapter= historiqueAdapter
        }

    }

    override fun onRessourceClick(ressource: Ressource, position: Int) {
        TODO("Not yet implemented")
    }
}
