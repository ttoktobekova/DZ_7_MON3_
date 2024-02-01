package com.example.dz_7_mon3_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz_7_mon3_.databinding.FragmentSongsListBinding


class SongsListFragment : Fragment() {
private lateinit var binding: FragmentSongsListBinding
private val songsList = arrayListOf(
    SongModel("1", "Вера в любовь", "Абир Касенов", "3:53"),
    SongModel("2", "Side to side", "Ariana Grande", "3:58"),
    SongModel("3", "Unforgettable", "French Montana", "3:43"),
    SongModel("4", "bloodline", "Ariana Grande", "3:38"),
    SongModel("5", "Любовь как сон", "УлукМанапо", "3:11"),
    SongModel("6", "Статус души", "Бакр", "3:53"),
    SongModel("7", "Мадам", "Нурлан Насип", "3:53"),
    SongModel("8", "Айтчы", "Мирбек Атабеков&Бегиш", "3:53"),
    SongModel("9", "18лет", "Садрадин", "3:53"),
    SongModel("10", "Егиз Лебиз", "Арнау тобу", "3:53"),
)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongsListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = SongsAdapter(songsList)
        binding.rvSongs.adapter = adapter
    }

}