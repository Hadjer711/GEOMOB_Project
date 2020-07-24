package com.example.geomob

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.geomob.UTILS.ImageSliderAdapter
import com.example.geomob.UTILS.PaysAdapter

import kotlinx.android.synthetic.main.fragment_pays_detail.*


class PaysDetailActivity : AppCompatActivity() {
    private var id="0"
    private var mediaPlayer:MediaPlayer?= null

    lateinit var paysAdapter: PaysAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pays_detail)

        val requestOptions = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
        Glide.with(this)
            .applyDefaultRequestOptions(requestOptions).load(getIntent().getStringExtra("drapeau"))
            .into(pays_drapeau)

        pays_surface.text= getIntent().getStringExtra("surface")
        pays_nom.text = getIntent().getStringExtra("nom")
        pays_description.text = getIntent().getStringExtra("description")
        pays_population.text = getIntent().getStringExtra("population")
        this.id=getIntent().getStringExtra("id")



        imageSliderImplementation()

        //go to video activity
        video.setOnClickListener{
            val intent= Intent(this, VideosActivity::class.java)
            intent.putExtra("video", getIntent().getStringExtra("video"))
            startActivity(intent)
        }


        //go to tweets activity

        //go to wikipedia activity
        wikipedia.setOnClickListener{
            val wikipediaUrl:String?= getIntent().getStringExtra("wikipedia")
            val intent= Intent(this, WikipediaActivity::class.java)
            intent.putExtra("wikipedia", wikipediaUrl)
            startActivity(intent)
        }

        //go to ressources activity
        ressouce.setOnClickListener{
            val intent= Intent(this, RessourceActivity::class.java)
            intent.putExtra("id", this.id)
            startActivity(intent)

        }

        //go to historique activity
        historique.setOnClickListener{
            val intent= Intent(this, HistoriqueActivity::class.java)
            intent.putExtra("id", this.id)
            startActivity(intent)

        }


        //go to personnalite activity
        personnalites.setOnClickListener{
            val intent= Intent(this, PersonnaliteActivity::class.java)
            intent.putExtra("id", this.id)
            startActivity(intent)

        }


        //play hymne
        mediaPlayer= MediaPlayer.create(this, getIntent().getIntExtra("hymne", R.raw.hymne_algerie) )
        mediaPlayer?.setOnPreparedListener{
            println("READY")
        }

        audio.setOnTouchListener{_, event->
            println("down")
            mediaPlayer?.start()
            true
        }

        audiostop.setOnTouchListener{_, event->
            println("stop")
            mediaPlayer?.pause()
            mediaPlayer?.seekTo(0)
            true
        }

    }

    private fun imageSliderImplementation() {

        Log.d("id", this.id)


        val adapter = ImageSliderAdapter(this,this.id.toInt())
        viewpager.adapter = adapter


    }

    private fun handleTouch(event: MotionEvent){
        when(event.action){
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_BUTTON_PRESS->{
                println("down")
                mediaPlayer?.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP ->{
                println("up or cancel")
                mediaPlayer?.pause()
                mediaPlayer?.seekTo(0)
            }
            else->{
                println("other")
            }
        }
    }

    }
