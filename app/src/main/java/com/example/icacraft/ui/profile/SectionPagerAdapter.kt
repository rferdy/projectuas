package com.example.icacraft.ui.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.icacraft.ui.home.newarrival.HomeNewArrivalFragment
import com.example.icacraft.ui.profile.account.ProfileAccountFragment
import com.example.icacraft.ui.profile.icacraft.ProfileIcacraftFragment

class SectionPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm){

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Account"
            1 -> "ICA CRAFTER"
            else -> ""
        }
    }
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment
        return when(position) {
            0 -> {
                fragment = ProfileAccountFragment()
                return fragment
            }
            1 -> {
                fragment = ProfileIcacraftFragment()
                return fragment
            }
            else -> {
                fragment = ProfileAccountFragment()
                return fragment
            }
        }
    }
}