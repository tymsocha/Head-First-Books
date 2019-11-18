package weather.observable;

import java.util.Observable;

public class WeatherDataObservable extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataObservable() {}

    public void readingsUpdate() {
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setReadings(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        readingsUpdate();
    }
}
