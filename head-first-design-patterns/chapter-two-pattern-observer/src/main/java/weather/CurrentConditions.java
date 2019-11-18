package weather;

public class CurrentConditions implements Observer, ShowElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        show();
    }

    @Override
    public void show() {
        System.out.println(new StringBuilder().append("Current weather conditions ").append(temperature).append(" Celsius degrees and ").append(humidity).append("% humidity."));
    }
}
