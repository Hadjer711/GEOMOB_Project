package com.example.geomob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.geomob.BD.Ressource
import com.example.geomob.UTILS.RessourceAdapter
import com.example.geomob.UTILS.RessourceAdapter.OnRessourceListener
import kotlinx.android.synthetic.main.activity_main.*

class RessourceActivity : AppCompatActivity(), OnRessourceListener {

    var toolbar: Toolbar? = null
    private lateinit var ressourceAdapter: RessourceAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ressource)
        toolbar=findViewById(R.id.toolbar)
        initRecycleView()
    }

    private fun initRecycleView(){
        recycleview.apply {
            layoutManager= LinearLayoutManager(this@RessourceActivity)
            val topSpacingItemDecoration= TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingItemDecoration)
            ressourceAdapter= RessourceAdapter(this@RessourceActivity)
            adapter= ressourceAdapter
        }

    }

    override fun onRessourceClick(ressource: Ressource, position: Int) {
        TODO("Not yet implemented")
    }
}
