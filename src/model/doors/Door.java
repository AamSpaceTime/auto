/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.doors;

/**
 *
 * @author Андрей
 */
public class Door {
    
    private boolean open;
    
    Door() {
        open = false;
    }
    
    Door(boolean oc) {
        if( oc ) {
            openDoor();
        } else {
            closeDoor();
        }
    }
    
    public void openDoor() {
        open = true;
    }
    
    public void closeDoor() {
        open = false;
    }    
    
}
