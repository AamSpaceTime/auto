/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import model.doors.Door;
import model.doors.Dictionaries.DoorTypes; 

/**
 *
 * @author Андрей
 */
public class Body {
    
    private float Weight = 1250.5f; //Вес машины

    /**
     *
     */
    private static HashMap <DoorTypes, Door> doors; //Двери
    private static boolean openDoorLamp;
    
    public Body() {
        //Создаем (вешаем) двери в автомобиль
        doors = new HashMap();
        for(DoorTypes temp: DoorTypes.values()) {
            doors.put(temp, new Door(temp));
        }
        openDoorLamp = false;
    }
    
    public HashMap getDoors() {
        return doors;
    }
    
    public boolean getOpenDoorLamp() {
        return openDoorLamp;
    }
    
    public void setOpenDoorLamp(boolean set) {
        openDoorLamp = set;
    }
    
    public float getWeight() {
        return Weight;
    }
    
}
