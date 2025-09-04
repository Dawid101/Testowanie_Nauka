package pl.coderslab.week3.stub;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherClientTest {

    @Mock
    private WeatherService mockWeather;

    @Test
    void testWeatherReport() {
        WeatherClient weatherClient = new WeatherClient(mockWeather);
        when(mockWeather.getCurrentTemperature("Kraków")).thenReturn(13.0);
        assertEquals("Temperatura w Kraków wynosi: 13.0°C", weatherClient.getWeatherReport("Kraków"));
    }

    @Test
    void testUnknownCity() {
        WeatherClient weatherClient = new WeatherClient(mockWeather);
        when(mockWeather.getCurrentTemperature("Poznań")).thenReturn(null);
        assertThrows(NullPointerException.class, () -> {
            weatherClient.getWeatherReport("Poznań");
        });
    }

}