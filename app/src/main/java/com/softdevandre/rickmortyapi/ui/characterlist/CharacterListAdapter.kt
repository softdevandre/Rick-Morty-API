package com.softdevandre.rickmortyapi.ui.characterlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.softdevandre.rickmortyapi.databinding.CharacterListItemBinding

class CharacterListAdapter(private val characters: List<CharacterListActivity.Character>) :
    RecyclerView.Adapter<CharacterListAdapter.ViewHolder>() {

    class ViewHolder(private val binding: CharacterListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CharacterListActivity.Character) = with(binding) {
            tvCharName.text = item.charName
            tvCharStatus.text = item.charStatus
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CharacterListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount() = characters.size
}
