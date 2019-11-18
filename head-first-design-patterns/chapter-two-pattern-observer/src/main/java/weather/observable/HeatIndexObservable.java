package weather.observable;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexObservable implements Observer, ShowElementObservable {
    float heatIndex = 0.0f;
    Observable observable;

    public HeatIndexObservable(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        heatIndex = computeHeatIndex(o);
        show();
    }

    public float computeHeatIndex(Observable observable) {
        float t = 0;
        float rh = 0;
        float index = 0;
        if(observable instanceof WeatherDataObservable) {
            WeatherDataObservable weatherDataObservable = (WeatherDataObservable) observable;
            t = weatherDataObservable.getTemperature();
            rh = weatherDataObservable.getHumidity();
            index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                    + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                    + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                    (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                    (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                    (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                    0.000000000843296 * (t * t * rh * rh * rh)) -
                    (0.000000000481975 * (t * t * t * rh * rh * rh)));
        }
        return index;
    }

    @Override
    public void show() {
        System.out.println("Heat index is " + heatIndex);
    }
}
