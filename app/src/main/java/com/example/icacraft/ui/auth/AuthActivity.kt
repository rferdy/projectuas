package com.example.icacraft.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.icacraft.R
import kotlinx.android.synthetic.main.layout_toolbar.*

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val pageRequest = intent.getIntExtra("page_request",0)
        if (pageRequest == 2){

            toolbarSignUp()

            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn, true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_signup, null, navOptions)
        }
    }

    fun toolbarSignUp(){
        toolbar.title = "Sign Up"
        toolbar.subtitle = "Register your profile"
        toolbar.navigationIcon = resources.getDrawable(R.drawable.arrow_back_ios_24px_outlined, null)
        toolbar.setOnClickListener { onBackPressed() }
    }

    fun toolbarSignUpAddress(){
        toolbar.title = "Sign Up"
        toolbar.subtitle = "Make sure it's valid"
        toolbar.navigationIcon = resources.getDrawable(R.drawable.arrow_back_ios_24px_outlined, null)
        toolbar.setOnClickListener { onBackPressed() }
    }

    fun toolbarSignUpSuccess(){
        toolbar.visibility = View.GONE
    }

}