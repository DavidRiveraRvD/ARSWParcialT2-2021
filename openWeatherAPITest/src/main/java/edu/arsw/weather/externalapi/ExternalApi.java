package edu.arsw.weather.externalapi;

import com.mashape.unirest.http.exceptions.UnirestException;

public interface ExternalApi {
    String getResponseByCity(String city)throws UnirestException;

}
