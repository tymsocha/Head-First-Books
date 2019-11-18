package weather;

import org.junit.Test;
import weather.observable.*;

public class WeatherstationTestSuite {
    @Test
    public void testCurrentConditions() {
        //Given
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        Statistics statistics = new Statistics(weatherData);
        Forecast forecast = new Forecast(weatherData);
        HeatIndex heatIndex = new HeatIndex(weatherData);
        //When
        weatherData.setReadings(26.6f, 65, 1013.1f);
        weatherData.setReadings(27.7f, 70, 997.0f);
        weatherData.setReadings(25.5f, 90, 997.0f);
    }

    @Test
    public void testObservable() {
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
        CurrentConditionsObservable currentConditionsObservable = new CurrentConditionsObservable(weatherDataObservable);
        StatisticsObservable statisticsObservable = new StatisticsObservable(weatherDataObservable);
        ForecastObservable forecastObservable = new ForecastObservable(weatherDataObservable);
        HeatIndexObservable heatIndexObservable = new HeatIndexObservable(weatherDataObservable);

        weatherDataObservable.setReadings(26.6f, 65, 1013.1f);
        weatherDataObservable.setReadings(27.7f, 70, 997.0f);
        weatherDataObservable.setReadings(25.5f, 90, 997.0f);
    }
}
