package com.example.geomob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geomob.UTILS.ImageSliderAdapter
import com.example.geomob.UTILS.PaysAdapter

import kotlinx.android.synthetic.main.fragment_pays_detail.*

class PaysDetailActivity : AppCompatActivity() {

    lateinit var paysAdapter: PaysAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pays_detail)

        pays_nom.text = getIntent().getStringExtra("nom")
        pays_description.text = getIntent().getStringExtra("description")
        pays_population.text = getIntent().getStringExtra("population")



        imageSliderImplementation()

        //go to video activity
        video.setOnClickListener{
            val intent= Intent(this, VideosActivity::class.java)
            intent.putExtra("video", "9Aebjmgn0bw")
            startActivity(intent)
        }


        //go to tweets activity

        //go to wikipedia activity

        //go to ressources activity

        //go to historique activity

        //go to personnalite activity
    }

    private fun imageSliderImplementation() {

        val adapter = ImageSliderAdapter(this)
        viewpager.adapter = adapter


    }

    }
