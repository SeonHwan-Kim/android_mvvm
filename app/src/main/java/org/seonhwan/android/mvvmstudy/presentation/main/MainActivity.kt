package org.seonhwan.android.mvvmstudy.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import org.seonhwan.android.mvvmstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val factory = MainFactory(100)
    private val viewModel by viewModels<MainViewModel>() { factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvMainCounter.text = viewModel.counter.toString()
        this.onClickIncreaseBtn()
    }

    private fun onClickIncreaseBtn() {
        with(binding) {
            btMainIncrease.setOnClickListener {
                viewModel.counter += 1
                tvMainCounter.text = viewModel.counter.toString()
            }
        }
    }
}