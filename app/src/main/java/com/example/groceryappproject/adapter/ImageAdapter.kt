package com.example.groceryappproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.groceryappproject.R

class ImageAdapter(val context: Context) : PagerAdapter() {

    private var inflater: LayoutInflater? = null
    private val images = arrayOf(R.drawable.offer, R.drawable.offer)
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater!!.inflate(R.layout.image_silder_item, null)

//        Picasso.get().load(images?.get(position)?.image?.image).placeholder(R.drawable.properties1).into(view.imageView_slide)
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