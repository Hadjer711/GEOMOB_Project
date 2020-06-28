package com.example.geomob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.NonNull
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import kotlinx.android.synthetic.main.fragment_pays_detail.*

class PaysDetailActivity : AppCompatActivity() {

    lateinit var paysAdapter: PaysAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pays_detail)

        pays_nom.text = getIntent().getStringExtra("nom")
        pays_description.text = getIntent().getStringExtra("description")
        pays_population.text = getIntent().getStringExtra("population")

        third_party_player_view.getPlayerUiController().showFullscreenButton(true)
        third_party_player_view.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
                val videoId = "9Aebjmgn0bw"
                youTubePlayer.cueVideo(videoId, 0f)
            }
        })

        third_party_player_view.getPlayerUiController().setFullScreenButtonClickListener(View.OnClickListener {
            if (third_party_player_view.isFullScreen()) {
                third_party_player_view.exitFullScreen()
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
                // Show ActionBar
                if (supportActionBar != null) {
                    supportActionBar!!.show()
                }
            } else {
                third_party_player_view.enterFullScreen()
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
                // Hide ActionBar
                if (supportActionBar != null) {
                    supportActionBar!!.hide()
                }
            }
        })

        imageSliderImplementation()
    }

    private fun imageSliderImplementation() {

        val adapter = ImageSliderAdapter(this)
        viewpager.adapter = adapter


    }

    }
