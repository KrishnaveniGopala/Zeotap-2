package com.weather;

import com.weather.service.WeatherService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WeatherMonitoringApp {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        
        executor.scheduleAtFixedRate(() -> {
            weatherService.fetchAndProcessWeather("Delhi"); // Add other cities as needed
        }, 0, 5, TimeUnit.MINUTES);
    }
}
