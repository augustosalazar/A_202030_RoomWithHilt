package com.uninorte.a_202030_roomwithhilt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uninorte.a_202030_roomwithhilt.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


    }

}