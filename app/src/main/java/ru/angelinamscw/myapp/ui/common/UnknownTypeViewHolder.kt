package ru.angelinamscw.myapp.ui.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.angelinamscw.myapp.databinding.ItemListUnknownTypeBinding

class UnknownTypeViewHolder(
    li: LayoutInflater,
    parent: ViewGroup,
    binding: ItemListUnknownTypeBinding = ItemListUnknownTypeBinding.inflate(li, parent, false)
) : RecyclerView.ViewHolder(binding.root) {
    var title = binding.tvUnknownTypeTitle
    var body = binding.tvUnknownTypeBody
    var name = binding.tvUnknownTypeName
    var sign = binding.ivUnknownTypeSign
}