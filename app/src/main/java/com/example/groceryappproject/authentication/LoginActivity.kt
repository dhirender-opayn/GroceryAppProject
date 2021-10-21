package com.example.groceryappproject.authentication

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.groceryappproject.common.BaseActivity
import com.example.groceryappproject.R
import com.example.groceryappproject.common.Utils
import com.example.groceryappproject.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity(), View.OnClickListener {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        click()
    }

    private fun click() {
        binding.register.setOnClickListener(this)
        binding.loginContainer.setOnClickListener(this)
        binding.tvForgotPassword.setOnClickListener(this)
    }
    private fun getText(){
        binding.email.text
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.register -> {
                openA(SignUpActivity::class)

            }
            R.id.login_container->{
                Utils.hideKeyboard(this)
            }
            R.id.tv_forgot_password->{
                openA(ForgotPasswordActivity::class)
            }

        }
    }
}