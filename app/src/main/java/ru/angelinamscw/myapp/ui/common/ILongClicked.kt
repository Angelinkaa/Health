package ru.angelinamscw.myapp.ui.common

import android.view.View

interface ILongClicked {
    fun onItemLongClicked(view: View, position: Int, itemObject: Any)
}