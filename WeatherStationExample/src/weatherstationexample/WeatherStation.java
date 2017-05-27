/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstationexample;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alex
 */
public class WeatherStation implements WSSubject {
    
    private double temperature;
    private double humidity;
    private double atmosphericPressure;
    private final Weather weather;
    private Set<WSObserver> observers;

    public WeatherStation(Weather weather) {
        observers = new HashSet<>();
        this.weather = weather;
    }
    
    public void measureWeather() {
        this.temperature = weather.temperature;
        this.humidity = weather.humidity;
        this.atmosphericPressure = weather.atmosphericPressure;
        notifyObservers();
    }

    @Override
    public void regsiter(WSObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregsiter(WSObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WSObserver observer : observers) {
            observer.update(this);
        }
    }    

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public double getHumidity() {
        return humidity;
    }

    @Override
    public double getAtmosphericPressure() {
        return atmosphericPressure;
    }
    
}
