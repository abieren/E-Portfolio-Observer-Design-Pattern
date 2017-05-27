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
public class LCDLiveDisplay implements WSObserver {

    @Override
    public void update(WSSubject subject) {
        displayWeather(subject.getTemperature(), subject.getHumidity(), subject.getAtmosphericPressure());
    }
    
    public void displayWeather(double temperature, double humidity, double atmosphericPressure) {
        String display = "WEATHER LIVE DISPLAY - "
                + " temperature:" + temperature
                + " humidity:" + humidity
                + " atmospheric pressure:" + atmosphericPressure;
        display = display.toUpperCase();
        System.out.println(display);
    }
    
}
