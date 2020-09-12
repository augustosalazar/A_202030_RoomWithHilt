package com.uninorte.a_202030_roomwithhilt.repository

import com.uninorte.a_202030_roomwithhilt.db.Entry
import com.uninorte.a_202030_roomwithhilt.db.EntryDAO
import javax.inject.Inject


class MainRepository @Inject constructor(
    val entryDao: EntryDAO
) {

    suspend fun insertEntry(entry: Entry) = entryDao.insertEntry(entry)

    suspend fun deleteEntry(entry: Entry) = entryDao.deleteEntry(entry)

    fun getAll() = entryDao.getAll()

}