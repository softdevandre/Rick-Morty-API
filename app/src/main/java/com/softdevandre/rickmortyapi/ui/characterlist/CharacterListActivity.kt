package com.softdevandre.rickmortyapi.ui.characterlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.softdevandre.rickmortyapi.databinding.ActivityCharacterListBinding

class CharacterListActivity : AppCompatActivity(){

    private val binding by lazy {
        ActivityCharacterListBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvCharacterList.layoutManager = LinearLayoutManager(this)
        binding.rvCharacterList.adapter = CharacterListAdapter(charMockList())

    }

    private fun charMockList(): List<Character> {
        return arrayListOf(
            Character("André", "Alive"),
            Character("José", "Alive"),
            Character("Pelé", "Alive"),
            Character("Mané", "Alive"),
        ).toList()
    }

    data class Character(val charName: String, val charStatus: String)

}

