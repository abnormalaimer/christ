package HeadFirstDesign.WeatherStation.Impl;

import HeadFirstDesign.WeatherStation.Interface.DisplayElement;
import HeadFirstDesign.WeatherStation.Interface.Observer;
import HeadFirstDesign.WeatherStation.Interface.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);

    }
    @Override
    public void display() {
        System.out.println("current conditions: "+temperature+"F degrees and "+humidity+"% humidity");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
