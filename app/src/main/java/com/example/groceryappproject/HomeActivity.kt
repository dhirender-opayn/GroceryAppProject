package com.example.groceryappproject


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.get
import com.example.groceryappproject.common.BaseActivity
import com.example.groceryappproject.common.Utils
import com.example.groceryappproject.fragment.CategoriesFragment
import com.example.groceryappproject.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigationClickListner()

    }

    private fun bottomNavigationClickListner() {
        bottomNavigationView.setOnItemSelectedListener { item ->
            Log.e("inn", "inner")
            when(item.itemId){
                R.id.home->{
                    Log.e("5475468586", "inner")

                    Utils.addReplaceFragment(
                        this,
                        HomeFragment(),
                        R.id.nav_container,
                        false,
                        false,
                        false
                    )
                }
                R.id.categories -> {
                    Utils.addReplaceFragment(
                        this,
                        CategoriesFragment(),
                        R.id.nav_container,
                        false,
                        false,
                        false
                    )
                }
            }
            true

        }
    }

    override fun onClick(v: View?) {

    }
}