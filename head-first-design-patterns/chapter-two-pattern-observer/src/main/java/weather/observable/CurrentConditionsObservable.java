package weather.observable;

import weather.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsObservable implements Observer, ShowElementObservable {
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsObservable(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherDataObservable) {
            WeatherDataObservable weatherData = (WeatherDataObservable) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            show();
        }
    }

    @Override
    public void show() {
        System.out.println(new StringBuilder().append("Current weather conditions ").append(temperature).append(" Celsius degrees and ").append(humidity).append("% humidity."));
    }
}
