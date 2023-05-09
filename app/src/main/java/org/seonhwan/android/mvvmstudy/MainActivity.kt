package org.seonhwan.android.mvvmstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.seonhwan.android.mvvmstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter = 100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvMainCounter.text = counter.toString()
        this.onClickIncreaseBtn()
    }

    private fun onClickIncreaseBtn() {
        with(binding) {
            btMainIncrease.setOnClickListener {
                counter += 1
                tvMainCounter.text = counter.toString()
            }
        }
    }
}