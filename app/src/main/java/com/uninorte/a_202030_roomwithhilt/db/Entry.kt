package com.uninorte.a_202030_roomwithhilt.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "entry_table")
class Entry (
    var text : String = ""
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}