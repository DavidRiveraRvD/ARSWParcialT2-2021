package edu.arsw.weather.service;

import com.mashape.unirest.http.exceptions.UnirestException;


public interface WeatherServices {
    String getWeatherByCity(String city)throws UnirestException;
}