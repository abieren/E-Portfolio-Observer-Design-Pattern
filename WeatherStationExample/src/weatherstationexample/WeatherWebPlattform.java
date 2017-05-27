/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstationexample;

/**
 *
 * @author Alex
 */
public class WeatherWebPlattform implements WSObserver {

    private final String plattformName;
    private double temperature;
    private double humidity;
    private double atmosphericPressure;

    public WeatherWebPlattform(String plattformName) {
        this.plattformName = plattformName;
    }
    
    @Override
    public void update(WSSubject subject) {
        this.temperature = subject.getTemperature();
        this.humidity = subject.getHumidity();
        this.atmosphericPressure = subject.getAtmosphericPressure();
        displayWeather();
    }
    
    public void displayWeather() {
        System.out.println(plattformName +" //"
                + " temperature:" + temperature
                + " humidity:" + humidity
                + " atmospheric pressure:" + atmosphericPressure);
    }
        
}
