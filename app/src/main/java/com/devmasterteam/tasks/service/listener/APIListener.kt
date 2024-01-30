package com.devmasterteam.tasks.service.listener

interface APIListener<T> {
    fun onSucces(result: T)
    fun onFailure(message: String)
}