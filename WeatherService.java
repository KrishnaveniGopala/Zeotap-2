package com.weather.service;

import com.weather.api.WeatherAPI;
import com.weather.model.WeatherData;

import java.util.HashMap;
import java.util.Map;

public class WeatherService {
    private WeatherAPI weatherAPI = new WeatherAPI();
    private Map<String, WeatherData> dailyWeather = new HashMap<>();

    public void fetchAndProcessWeather(String city) {
        try {
            WeatherData data = weatherAPI.getWeatherData(city);
            // Store data in dailyWeather map and calculate aggregates
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void calculateDailySummary() {
        // Calculate daily aggregates: average, max, min temperature, and dominant weather
    }
}
