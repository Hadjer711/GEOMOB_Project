package com.example.geomob.UTILS

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.geomob.R
import kotlinx.android.synthetic.main.image_slider_item.view.*

class ImageSliderAdapter(private val context: Context, image:Int) : PagerAdapter() {


    //var imagesList= images.split(",").map { it.toInt() }.toTypedArray()

    private val choose= image
    private var inflater: LayoutInflater? = null
    private var images = arrayOf(
        R.drawable.dz1,
        R.drawable.dz2,
        R.drawable.dz3
    )

    fun chooseSlides(){
        when(this.choose){
            1-> this.images = arrayOf(
                R.drawable.dz1,
                R.drawable.dz2,
                R.drawable.dz3
            )
            2->this.images = arrayOf(
                R.drawable.tu1,
                R.drawable.tu2,
                R.drawable.tu3
            )
            3->this.images = arrayOf(
                R.drawable.es1,
                R.drawable.es2,
                R.drawable.es3
            )
            4->this.images = arrayOf(
                R.drawable.li1,
                R.drawable.li2,
                R.drawable.li3
            )
            5->this.images = arrayOf(
                R.drawable.ci1,
                R.drawable.ci2,
                R.drawable.ci3
            )

        }
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view === `object`
    }

    override fun getCount(): Int {

        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        chooseSlides()
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater!!.inflate(R.layout.image_slider_item, null)
        view.imageView_slide.setImageResource(images[position])

        val vp = container as ViewPager
        vp.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val vp = container as ViewPager
        val view = `object` as View
        vp.removeView(view)
    }

}