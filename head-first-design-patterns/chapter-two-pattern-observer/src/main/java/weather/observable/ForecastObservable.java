package weather.observable;

import java.util.Observable;
import java.util.Observer;

public class ForecastObservable implements Observer, ShowElementObservable {
    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastObservable(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherDataObservable) {
            WeatherDataObservable weatherDataObservable = (WeatherDataObservable) observable;
            lastPressure = currentPressure;
            currentPressure = weatherDataObservable.getPressure();
            show();
        }
    }

    @Override
    public void show() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
