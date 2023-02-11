package ru.angelinamscw.myapp.model.repository

import ru.angelinamscw.domain.CallBack
import ru.angelinamscw.domain.Record

interface IRepository {
    fun getList(callBack: CallBack<List<Record>>)
    fun addNewRecord(record: Record, callBack: CallBack<Record>)
    fun updateRecord(record: Record, callBack: CallBack<Any>)
    fun deleteAllRecord(callBack: CallBack<Any>)
    fun deleteRecord(record: Record, callBack: CallBack<Any>)
}