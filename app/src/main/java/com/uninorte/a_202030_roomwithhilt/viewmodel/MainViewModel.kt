package com.uninorte.a_202030_roomwithhilt.viewmodel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uninorte.a_202030_roomwithhilt.db.Entry
import com.uninorte.a_202030_roomwithhilt.repository.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
) : ViewModel(){

    fun insertEntry(entry: Entry) = viewModelScope.launch {
        Log.d("MyOut","MainViewModel insert entry");
        mainRepository.insertEntry(entry)
    }

    fun selectAll() = mainRepository.getAll()

}