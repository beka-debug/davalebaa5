package com.luka.myapplication

import androidx.room.Room

object Database {

    val db = Room.databaseBuilder(
        AppClass.context!!,
        AppDatabase.AppDatabase::class.java, "fitness"
    ).build()

}