package com.example.groceryappproject.authentication

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.groceryappproject.R
import com.example.groceryappproject.common.BaseActivity
import com.example.groceryappproject.common.Utils
import com.example.groceryappproject.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity(), View.OnClickListener {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)
        singupClick()
    }

    private fun singupClick() {
        binding.tvlogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.singup_container -> {
                Utils.hideKeyboard(this)
            }
            R.id.tvlogin -> {
                onBackPressed()
            }
        }
    }
}