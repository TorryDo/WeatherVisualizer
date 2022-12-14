package com.torrydo.weathervisualizer.data.remote

import com.google.common.truth.Truth.assertThat
import com.torrydo.weathervisualizer.common.model.onError
import com.torrydo.weathervisualizer.common.model.onSuccess
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test

class OpenMeteoWeatherApiTest {

    lateinit var api: OpenMeteoWeatherApi

    @Before
    fun b4() {
        api = OpenMeteoWeatherApi()
    }

    @After
    fun aft() {
//        println("have a good day.hehe!")
    }

    @Test
    fun getWeather() {

        val lat = 10.8
        val lon = 106.8

        runBlocking {
            val rs = api.getWeather(lat = lat, lon = lon)

            assertThat(rs.exception).isNull()
            assertThat(rs.data).isNotNull()

        }

    }
}