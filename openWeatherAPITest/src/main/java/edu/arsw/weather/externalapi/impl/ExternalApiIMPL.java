package edu.arsw.weather.externalapi.impl;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.arsw.weather.externalapi.ExternalApi;
import org.springframework.stereotype.Service;


public class ExternalApiIMPL implements ExternalApi {
    @Override
    public String getResponseByCity(String city) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+city+"&units=metric&appid=6f4dac6bfe83ebe2583bc93158e5b057").asString();
        return response.getBody();
    }
}
