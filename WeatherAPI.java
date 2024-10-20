package com.weather.api;

import com.weather.model.WeatherData;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherAPI {
    private static final String API_KEY = "YOUR_API_KEY";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";

    public WeatherData getWeatherData(String city) throws IOException {
        String urlString = BASE_URL + city + "&appid=" + API_KEY + "&units=metric";
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        // Check for response code
        if (connection.getResponseCode() != 200) {
            throw new RuntimeException("HTTP response code: " + connection.getResponseCode());
        }

        // Parse JSON response
        Scanner scanner = new Scanner(url.openStream());
        StringBuilder response = new StringBuilder();
        while (scanner.hasNext()) {
            response.append(scanner.nextLine());
        }
        scanner.close();

        // Convert JSON to WeatherData object (implement parsing logic)
        return parseWeatherData(response.toString());
    }

    private WeatherData parseWeatherData(String jsonResponse) {
        // Use a JSON library (e.g., Gson) to parse the response
        // Return a WeatherData object
    }
}
