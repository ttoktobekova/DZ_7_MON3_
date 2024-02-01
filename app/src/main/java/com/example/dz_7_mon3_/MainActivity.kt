package com.example.dz_7_mon3_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_7_mon3_.databinding.ActivitySecondBinding
import com.example.dz_7_mon3_.databinding.FragmentSongsBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.firstFragment, SongsFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.secondFragment, SongsListFragment()).commit()
    }
}