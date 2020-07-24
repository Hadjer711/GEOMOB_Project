package com.example.geomob

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.geomob.BD.*
import com.example.geomob.UTILS.PaysAdapter
import com.example.projetgeomob.DataBase
import com.example.projetgeomob.PaysDAO
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_pays_detail.*

class MainActivity : AppCompatActivity(), PaysAdapter.OnPaysListener {
    var toolbar: Toolbar? = null
    private lateinit var paysAdapter: PaysAdapter
    public var db: DataBase? = null
    public var dao: PaysDAO? = null
    public var daoHistorique: HistoriqueDAO? = null
    public var daoPersonnalite: PersonnaliteDAO? = null
    public var daoRessource: RessourceDAO? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar=findViewById(R.id.toolbar)
        initRecycleView()
        addDataSet()




    }

    private fun addDataSet(){
        val dataPays= DataSource.createDataSet()
        val dataHistorique =DataSource.createDataSetHistorique()
        val dataPersonnalite= DataSource.createDataSetPersonnalite()
        val dataRessource= DataSource.createDataSetRessource()
        this.db = DataBase.invoke(this)
        for(pays in dataPays){
            this.dao = db?.paysDAO()
            this.dao?.ajouter(pays)

        }
        for(historique in dataHistorique){
            this.daoHistorique = db?.historiqueDAO()
            this.daoHistorique?.ajouter(historique)

        }
        for(ressource in dataRessource){
            this.daoRessource = db?.ressourceDAO()
            this.daoRessource?.ajouter(ressource)

        }
        for(personnalite in dataPersonnalite){
            this.daoPersonnalite = db?.personnaliteDAO()
            this.daoPersonnalite?.ajouter(personnalite)

        }
        this.dao?.getPays()?.let { paysAdapter.submitList(it) }


    }

    private fun initRecycleView(){
        recycleview. apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            val topSpacingItemDecoration= TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingItemDecoration)
            paysAdapter= PaysAdapter(this@MainActivity)
            adapter= paysAdapter
        }

    }

    override fun onPaysClick(pays: Pays, position: Int) {
        Toast.makeText(this, pays.nom, Toast.LENGTH_SHORT).show()
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            pays_nom.text= pays.nom
            pays_description.text= "description "+pays.description
            pays_population.text= "   "+pays.population

        } else {
            val intent= Intent(this, PaysDetailActivity::class.java)
            intent.putExtra("nom", "nom du pays : "+pays.nom)
            intent.putExtra("description", "Description du pays : " +pays.description)
            intent.putExtra("population", "population : "+pays.population)
            intent.putExtra("surface", "surface : "+pays.surface)
            intent.putExtra("drapeau", "drapeau : "+pays.drapeau)
            intent.putExtra("drapeau", pays.drapeau)
            intent.putExtra("hymne", pays.hymne)
            intent.putExtra("id", pays.id.toString())

            intent.putExtra("wikipedia", pays.wikipedia)

            intent.putExtra("video", pays.videos)
            startActivity(intent)
        }


    }
}
