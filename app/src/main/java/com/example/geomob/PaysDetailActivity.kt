package com.example.geomob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_pays_detail.*

class PaysDetailActivity : AppCompatActivity() {

    lateinit var paysAdapter: PaysAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pays_detail)

        pays_nom.text = getIntent().getStringExtra("nom")
        pays_description.text = getIntent().getStringExtra("description")
        pays_population.text = getIntent().getStringExtra("population")

    }
}
