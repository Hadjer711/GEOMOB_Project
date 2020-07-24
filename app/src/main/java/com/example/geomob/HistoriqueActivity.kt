package com.example.geomob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.geomob.BD.Historique
import com.example.geomob.BD.HistoriqueDAO

import com.example.geomob.UTILS.HistoriqueAdapter

import com.example.projetgeomob.DataBase
import kotlinx.android.synthetic.main.activity_main.*

class HistoriqueActivity : AppCompatActivity() , HistoriqueAdapter.OnHistoriqueListener{
    public var db: DataBase? = null
    var daoHistorique: HistoriqueDAO? = null

    var toolbar: Toolbar? = null
    private lateinit var historiqueAdapter: HistoriqueAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historique)
        toolbar=findViewById(R.id.toolbar)

        initRecycleView()
        getData()
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

    private fun getData(){
        var id = getIntent().getStringExtra("id").toInt()
        Log.d("id ressource", id.toString())
        this.db = DataBase.invoke(this)
        this.daoHistorique = db?.historiqueDAO()
        this.daoHistorique?.getHistoriquePays(id)?.let { historiqueAdapter.submitList(it) }
    }

    override fun onHistoriqueClick(historique: Historique, position: Int) {
        TODO("Not yet implemented")
    }


}
