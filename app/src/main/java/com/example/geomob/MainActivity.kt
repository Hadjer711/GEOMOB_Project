package com.example.geomob

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
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

class MainActivity : AppCompatActivity(), PaysAdapter.OnLivreListener {
    var toolbar: Toolbar? = null
    private lateinit var paysAdapter: PaysAdapter
    private var db: DataBase? = null
    private var dao: PaysDAO? = null
    private var daoHistorique: HistoriqueDAO? = null
    private var daoPersonnalite: PersonnaliteDAO? = null
    private var daoRessource: RessourceDAO? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar=findViewById(R.id.toolbar)
        initRecycleView()
        addDataSet()




    }
    private fun addDataSetToRoom(){

    }
    private fun addDataSet(){
        val data= DataSource.createDataSet()
        val historique= Historique(1,"date test", "descriptiontest")
        val ressource= Ressource(1, "test", "test", "test")
        val personnalite= Personnalite(1,"hey", "teststst", "lien")
        this.db = DataBase.invoke(this)
        this.daoHistorique = db?.historiqueDAO()
        this.daoPersonnalite = db?.personnaliteDAO()
        this.daoRessource = db?.ressourceDAO()
        this.daoPersonnalite?.ajouter(personnalite)
        this.daoRessource?.ajouter(ressource)
        this.daoHistorique?.ajouter(historique)



        for(pays in data){
            this.dao = db?.paysDAO()
            this.dao?.ajouter(pays)

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

    override fun onLivreClick(pays: Pays, position: Int) {
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
            intent.putExtra("drapeau", pays.drapeau)
            startActivity(intent)
        }


    }
}
