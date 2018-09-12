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
    protected final Glass glass;
    
    Door() {
        open = false;
        glass = new Glass(Glass.TypeList.FrontLeftDoor.toString());
    }
    
    Door(boolean oc) {
        if( oc ) {
            openDoor();
        } else {
            closeDoor();
        }
        glass = new Glass(Glass.TypeList.FrontLeftDoor.toString());
    }
    
    public void openDoor() {
        open = true;
    }
    
    public void closeDoor() {
        open = false;
    } 
 
    public final Glass getGlass() {
        return glass;        
    } 
    
}
