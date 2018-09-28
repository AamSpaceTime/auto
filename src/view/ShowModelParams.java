/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.HashMap;
import model.Body;
import model.doors.Dictionaries;
import model.doors.Dictionaries.DoorTypes;
import model.doors.Door;

/**
 *
 * @author Aam
 */
public class ShowModelParams {
    
    private Body model;
    
    public ShowModelParams(Body model) {
        this.model = model;
    }
    
    public void openDoorLamp() {
        System.out.println(">>>>>>>>>>>>>>>>>>>");        
        showDoorLamp();
        System.out.println("<<<<<<<<<<<<<<<<<<<");
    }
    
    private void showDoorLamp() {
        if(model.getOpenDoorLamp()) {
            System.out.println("Двери открыты");
        } else {
            System.out.println("Двери закрыты");
        }    
    }
    
    private void showWeight() {
        System.out.println("Вес: "+model.getWeight());
    }
    
    private void showDoors() {
        HashMap <Dictionaries.DoorTypes, Door> d = model.getDoors();
        for(Door temp: d.values()) {
            System.out.println("Код двери: "+temp.getNumber());
        }
    }
    
    
    public void showModelParams() {
        System.out.println("\nСостояние модели:");
        System.out.println("#########################");
        showWeight();
        showDoorLamp();
        showDoors();
        System.out.println("#########################");
    }
    
}
