package com.luka.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataModel(
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    @ColumnInfo(name = "run_distance") val runDistance: Int? = 0,
    @ColumnInfo(name = "swim_distance") val swimDistance: Int? = 0,
    @ColumnInfo(name = "calories") val calories: Int? = 0
)
