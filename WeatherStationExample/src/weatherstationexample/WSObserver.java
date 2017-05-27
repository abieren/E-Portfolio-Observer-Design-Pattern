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
public interface WSObserver {
    
    public void update(WSSubject subject);
    
}
