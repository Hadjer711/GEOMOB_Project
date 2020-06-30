package com.example.geomob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.geomob.BD.Personnalite
import com.example.geomob.UTILS.HistoriqueAdapter
import com.example.geomob.UTILS.PersonnaliteAdapter
import kotlinx.android.synthetic.main.activity_main.*

class PersonnaliteActivity : AppCompatActivity(), PersonnaliteAdapter.OnPersonnaliteListener {

    var toolbar: Toolbar? = null
    private lateinit var personnaliteAdapter: PersonnaliteAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personnalite)
        toolbar=findViewById(R.id.toolbar)
        initRecycleView()
    }

    private fun initRecycleView(){
        recycleview. apply {
            layoutManager= LinearLayoutManager(this@PersonnaliteActivity)
            val topSpacingItemDecoration= TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingItemDecoration)
            personnaliteAdapter=PersonnaliteAdapter(this@PersonnaliteActivity)
            adapter= personnaliteAdapter
        }

    }

    override fun onPersonnaliteClick(personnalite: Personnalite, position: Int) {
        TODO("Not yet implemented")
    }
}
