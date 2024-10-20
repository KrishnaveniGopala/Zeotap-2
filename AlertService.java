package com.weather.service;

public class AlertService {
    private double temperatureThreshold;
    
    public void checkAlerts(WeatherData data) {
        if (data.getTemperature() > temperatureThreshold) {
            triggerAlert(data);
        }
    }

    private void triggerAlert(WeatherData data) {
        // Logic to trigger alert (e.g., send email or print to console)
    }
}
