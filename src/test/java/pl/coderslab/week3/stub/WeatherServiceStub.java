package pl.coderslab.week3.stub;

public class WeatherServiceStub implements WeatherService{

    @Override
    public Double getCurrentTemperature(String city) {
        return switch (city){
            case "Warszawa" -> 15.5;
            case "Kraków" -> 13.0;
            default -> null;
        };
    }
}
