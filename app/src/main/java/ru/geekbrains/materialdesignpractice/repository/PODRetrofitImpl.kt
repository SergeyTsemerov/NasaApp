package ru.geekbrains.materialdesignpractice.repository

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PODRetrofitImpl {
    private val baseUrl = "https://api.nasa.gov/"

    fun getRetrofitImpl(): PictureOfTheDayAPI {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
            .build().create(PictureOfTheDayAPI::class.java)
    }
}