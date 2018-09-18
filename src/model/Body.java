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
    
    private float Weight; //Вес машины

    /**
     *
     */
    private static HashMap <DoorTypes, Door> doors; //Двери
    
    Body() {
        //Создаем (вешаем) двери в автомобиль
        doors = new HashMap();
        for(DoorTypes temp: DoorTypes.values()) {
            doors.put(temp, new Door(temp));
        }
    }
    
    public HashMap getDoors() {
        return doors;
    }
    
    //private Door d = new Door();
    
}
