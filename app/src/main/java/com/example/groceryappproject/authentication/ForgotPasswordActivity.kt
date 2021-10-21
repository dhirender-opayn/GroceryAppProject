package com.example.groceryappproject.authentication

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.groceryappproject.R
import com.example.groceryappproject.common.BaseActivity
import com.example.groceryappproject.common.Utils
import com.example.groceryappproject.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : BaseActivity(), View.OnClickListener {
    lateinit var binding: ActivityForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_forgot_password)
        forgotclick()
        toolbar()
    }

    private fun toolbar() {
        binding.forgotToolbar.menu.setImageResource(R.drawable.ic_baseline_arrow_back_24)
        binding.forgotToolbar.toolbarTitle.visibility = View.VISIBLE
        binding.forgotToolbar.toolbarTitle.setText(getString(R.string.forgot_password2))
        binding.forgotToolbar.searchBar.visibility = View.GONE
        binding.forgotToolbar.cart.visibility = View.GONE
    }
    private fun forgotclick() {
        binding.forgotPasswordContainer.setOnClickListener(this)
        binding.forgotBtn.setOnClickListener(this)
        binding.forgotToolbar.menu.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.forgot_password_container -> {
                Utils.hideKeyboard(this)
            }
            R.id.forgot_btn ->{
                openA(ChangePasswordActivity::class)
            }
            R.id.menu -> {
                onBackPressed()
            }
        }

    }
}