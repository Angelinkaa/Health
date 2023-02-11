package ru.angelinamscw.myapp.ui.common

import androidx.lifecycle.ViewModel
import ru.angelinamscw.domain.BaseConstants
import ru.angelinamscw.myapp.model.repository.Repository

abstract class BaseViewModel : ViewModel() {
    protected val TAG = "${BaseConstants.MY_TAG} / ${this.javaClass.simpleName}"
    protected val repository = Repository()
}