package com.example.icacraft.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.icacraft.R
import com.example.icacraft.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_sign_up_address.*

class SignUpAddressFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up_address, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_SignUpNow.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.fragmentSignUpSuccess, null)

            (activity as AuthActivity).toolbarSignUpSuccess()
        }
    }

}