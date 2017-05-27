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
public class WeatherStationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creating weather
        Weather weatherOfKarlsruhe = new Weather();
        //creating weather station 
        WeatherStation weatherStationKarlsruhe = new WeatherStation(weatherOfKarlsruhe);
        //creating a web plattform that hosts the current weather information
        WeatherWebPlattform myWeather = new WeatherWebPlattform("MyWeather.com");
        //creating a live display to show weather details to the pedestrians
        LCDLiveDisplay lcdLiveDisplay = new LCDLiveDisplay();
        
        //regsiter myWeather as an observer
        weatherStationKarlsruhe.regsiter(myWeather);
        //register the lcd display as an observer
        weatherStationKarlsruhe.regsiter(lcdLiveDisplay);
        
        //we have the power to change the weather, so we do it!
        weatherOfKarlsruhe.temperature = -40.1;
        weatherOfKarlsruhe.humidity = 0.01;
        weatherOfKarlsruhe.atmosphericPressure = 970.2;
        //kindly ask the weather station to perform its next measurement
        weatherStationKarlsruhe.measureWeather();
        //now we should see that the observers have been updated and printed 
        //their information on the console
        
    }
    
}
