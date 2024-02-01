package com.example.dz_7_mon3_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_7_mon3_.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val musicName = intent.getStringExtra("musicName")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = musicName
    }
}