package com.example.groceryappproject.authentication

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.groceryappproject.R
import com.example.groceryappproject.common.BaseActivity
import com.example.groceryappproject.common.Utils
import com.example.groceryappproject.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : BaseActivity(), View.OnClickListener {
    lateinit var binding: ActivityChangePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_change_password)
        toolbar()
        onClick()

    }

    private fun onClick() {
        binding.changeToolbar.menu.setOnClickListener(this)
        binding.changePasswordContainer.setOnClickListener(this)

    }

    private fun toolbar() {
        binding.changeToolbar.menu.setImageResource(R.drawable.ic_baseline_arrow_back_24)
        binding.changeToolbar.toolbarTitle.visibility = View.VISIBLE
        binding.changeToolbar.toolbarTitle.setText(getString(R.string.change_password))
        binding.changeToolbar.searchBar.visibility = View.GONE
        binding.changeToolbar.cart.visibility = View.GONE
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.change_toolbar -> {
                onBackPressed()
            }
            R.id.change_password_container -> {
                Utils.hideKeyboard(this)
            }
            R.id.menu -> {
                onBackPressed()
            }
        }

    }

}