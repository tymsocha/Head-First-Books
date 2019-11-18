package weather;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData implements Subject {
    private ArrayList<Observer> observersList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observersList = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observersList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        int i = observersList.indexOf(observer);
        if (i >= 0) {
            observersList.remove(i);
        }
    }

    public void informObservers() {
        for (Observer observer : observersList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void readingsUpdate() {
        informObservers();
    }

    public void setReadings(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        readingsUpdate();
    }
}
