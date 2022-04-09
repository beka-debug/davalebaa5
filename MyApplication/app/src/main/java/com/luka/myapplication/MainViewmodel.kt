package com.luka.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.luka.myapplication.DataModel
import com.luka.myapplication.Database
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewmodel : ViewModel() {

    private val _fitData = MutableLiveData<List<DataModel>>()
    val data: LiveData<List<DataModel>> = _fitData

    fun read() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _fitData.postValue(Database.db.fitnessDao().loadAll())
            }
        }
    }

    fun write(run: Int, swim: Int, calorie: Int) {
        val fitnessData = DataModel(run, swim, calorie)

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                Database.db.fitnessDao().insertAll(fitnessData)
            }
        }
    }

}