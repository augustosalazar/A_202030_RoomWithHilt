package com.uninorte.a_202030_roomwithhilt.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import com.uninorte.a_202030_roomwithhilt.R
import com.uninorte.a_202030_roomwithhilt.db.Entry
import com.uninorte.a_202030_roomwithhilt.db.EntryDAO
import com.uninorte.a_202030_roomwithhilt.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var entryDAO: EntryDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        Log.d("MyOut", "entryDAO ${entryDAO.hashCode()}")

    }

}