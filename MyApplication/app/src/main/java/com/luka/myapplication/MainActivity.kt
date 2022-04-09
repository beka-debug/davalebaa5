package com.luka.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.luka.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewmodel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        observes()
        init()
        setContentView(binding.root)
    }

    private fun init(){
        binding.btAdd.setOnClickListener {
            viewModel.write(
                binding.etRun.text.toString().toInt(),
                binding.etSwim.text.toString().toInt(),
                binding.etCalories.text.toString().toInt()
            )
        }
    }

    private fun observes() {
        viewModel.data.observe(this,  {
            Log.d("myMessage", "${it.size}")
        })
    }
}