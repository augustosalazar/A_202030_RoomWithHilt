package com.uninorte.a_202030_roomwithhilt.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Entry::class],
    version = 1
)
abstract class EntryDatabase : RoomDatabase(){

    abstract fun getRunDao(): EntryDAO
}