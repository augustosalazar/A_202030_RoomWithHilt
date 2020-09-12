package com.uninorte.a_202030_roomwithhilt.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface EntryDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEntry(entry: Entry)

    @Delete
    suspend fun deleteEntry(entry: Entry)

    @Query("SELECT * FROM entry_table")
    fun getAll(): LiveData<List<Entry>>

}