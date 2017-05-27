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
public interface WSSubject {
    
    public void regsiter(WSObserver observer);
    public void unregsiter(WSObserver observer);
    public void notifyObservers();
    
    public double getTemperature();
    public double getHumidity();
    public double getAtmosphericPressure();
    
}
