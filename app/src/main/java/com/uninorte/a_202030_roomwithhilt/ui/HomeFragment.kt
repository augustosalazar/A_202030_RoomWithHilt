package com.uninorte.a_202030_roomwithhilt.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.uninorte.a_202030_roomwithhilt.R
import kotlinx.android.synthetic.main.fragment_first.*

class HomeFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.setOnClickListener { view ->

        }

    }
}