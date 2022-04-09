package com.luka.myapplication

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.luka.myapplication.DataModel

@Dao
interface FitnessDao {

    @Query("SELECT * FROM DataModel")
    suspend fun loadAll(): List<DataModel>

    @Query("SELECT run_distance FROM DataModel")
    suspend fun loadAllRun(): List<DataModel>

    @Query("SELECT swim_distance FROM DataModel")
    suspend fun loadAllSwim(): List<DataModel>

    @Query("SELECT calories FROM DataModel")
    suspend fun loadAllCalorie(): List<DataModel>

    @Insert
    suspend fun insertAll(vararg fitData: DataModel)

}
