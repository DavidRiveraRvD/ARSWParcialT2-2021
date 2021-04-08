package edu.arsw.weatherApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw.weather"})

public class WeatherAPIApp{
    public static void main(String[] args) {
        SpringApplication.run(WeatherAPIApp.class, args);
    }


}