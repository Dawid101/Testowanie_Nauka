package pl.coderslab.week3.stub;

public class WeatherClient {
    private final WeatherService weatherService;

    public WeatherClient(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getWeatherReport(String city) {
        double temperature = weatherService.getCurrentTemperature(city);
        return "Temperatura w " + city + " wynosi: " + temperature + "°C";
    }
}
