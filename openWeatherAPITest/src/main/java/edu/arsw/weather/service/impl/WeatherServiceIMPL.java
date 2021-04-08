package edu.arsw.weather.service.impl;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.arsw.weather.externalapi.ExternalApi;
import edu.arsw.weather.service.WeatherServices;
import org.springframework.beans.factory.annotation.Autowired;

public class WeatherServiceIMPL implements WeatherServices {

    @Autowired
    ExternalApi externalAPI;
    
    @Override
    public String getWeatherByCity(String city) throws UnirestException {
        return externalAPI.getResponseByCity(city);
    }
}
