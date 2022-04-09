package com.luka.myapplication

import androidx.room.Database
import androidx.room.RoomDatabase

class AppDatabase {

    //Caused by: java.lang.RuntimeException: cannot find implementation for com.luka.myapplication.AppDatabase.AppDatabase. AppDatabase_AppDatabase_Impl does not exist
    //ველანაირად ვცადე გაფიქსვა და არაფერმა უშველა

    @Database(entities = [DataModel::class], version = 1, exportSchema = false)
    abstract class AppDatabase: RoomDatabase(){
        abstract fun fitnessDao(): FitnessDao
    }

}