package com.example.icacraft.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.icacraft.ui.home.newarrival.HomeNewArrivalFragment
import com.example.icacraft.ui.home.popular.HomePopularFragment
import com.example.icacraft.ui.home.recomended.HomeRecomendedFragment

class SectionPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm){

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "New Arrival"
            1 -> "Popular"
            2 -> "Recomended"
            else -> ""
        }
    }
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment
        return when(position) {
            0 -> {
                fragment = HomeNewArrivalFragment()
                return fragment
            }
            1 -> {
                fragment = HomePopularFragment()
                return fragment
            }
            2 -> {
                fragment = HomeRecomendedFragment()
                return fragment
            }
            else -> {
                fragment = HomeNewArrivalFragment()
                return fragment
            }
        }
    }
}