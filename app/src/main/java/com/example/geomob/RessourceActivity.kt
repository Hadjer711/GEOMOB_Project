package com.example.geomob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.geomob.BD.Ressource
import com.example.geomob.BD.RessourceDAO
import com.example.geomob.UTILS.RessourceAdapter
import com.example.geomob.UTILS.RessourceAdapter.OnRessourceListener
import com.example.projetgeomob.DataBase
import kotlinx.android.synthetic.main.activity_main.*

class RessourceActivity : AppCompatActivity(), OnRessourceListener {
    public var db: DataBase? = null
    var daoRessource: RessourceDAO? = null

    var toolbar: Toolbar? = null
    private lateinit var ressourceAdapter: RessourceAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ressource)
        toolbar=findViewById(R.id.toolbar)

        initRecycleView()
        getData()

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
    private fun getData(){
        var id = getIntent().getStringExtra("id").toInt()
        Log.d("id ressource", id.toString())
        this.db = DataBase.invoke(this)
        this.daoRessource = db?.ressourceDAO()
        this.daoRessource?.getRessourcePays(id)?.let { ressourceAdapter.submitList(it) }
    }

    override fun onRessourceClick(ressource: Ressource, position: Int) {
        TODO("Not yet implemented")
    }
}
