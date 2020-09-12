package com.uninorte.a_202030_roomwithhilt.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.uninorte.a_202030_roomwithhilt.R
import com.uninorte.a_202030_roomwithhilt.db.Entry
import com.uninorte.a_202030_roomwithhilt.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_first.*

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.selectAll().observe(getViewLifecycleOwner(), Observer { entries ->
            Log.d("MyOut","Fragment  selectAll "+entries.size);
        })

        fab.setOnClickListener { view ->
            viewModel.insertEntry(Entry("Test"))
        }

    }
}