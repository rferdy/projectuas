package com.example.icacraft.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.icacraft.R
import com.example.icacraft.model.dummy.HomeModel
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.ArrayList

class HomeFragment : Fragment(), HomeAdapter.ItemAdapterCallback{

  private var craftlist : ArrayList<HomeModel> = ArrayList()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val root = inflater.inflate(R.layout.fragment_home, container, false)
    return root
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    initDataDummy()
    var adapter = HomeAdapter(craftlist, this)
    var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    rclist.layoutManager = layoutManager
    rclist.adapter = adapter

    val sectionPagerAdapter = SectionPagerAdapter(
        childFragmentManager
    )
    viewPager.adapter = sectionPagerAdapter
    tabLayout.setupWithViewPager(viewPager)

  }

  fun initDataDummy() {
      craftlist = ArrayList()
      craftlist.add(HomeModel("Starp Mask", "", 5f))
      craftlist.add(HomeModel("Gantungan Kunci", "", 3f))
      craftlist.add(HomeModel("Dream Catcher", "", 4f))
  }

  override fun onClick(v: View, data: HomeModel) {
    Toast.makeText(context, "test click "+data.title, Toast.LENGTH_SHORT).show()
  }
}