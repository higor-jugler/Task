package com.devmasterteam.tasks.service.repository.remote

import com.devmasterteam.tasks.service.model.PersonModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface PersonService {

    @POST("Authentication/Login")
    @FormUrlEncoded
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<PersonModel>

    @POST("Authentication/Create")
    @FormUrlEncoded
    fun create(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<PersonModel>

}

//{
//    "name":"Jamelao",
//    "token":"ncq9ZWHtc8J5gV+8xeC/bJjwCBZeOuYy5bbssyScvYwGc/jR2eZYgg==",
//    "personKey":"AO7jgCNtLcnuhpT64BxfNJ79ziDuG8Ga84iEYeECFVU="
//}