/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import model.Body;
import model.doors.Dictionaries.DoorTypes; 
import model.doors.Door;

/**
 *
 * @author Андрей
 */
public class Main {
    
    Body model;
    
    Main(Body model) {
        this.model = model;
    }
    
    
    
    /**
     * Открываем дверь заданную аргументом dt
     * @param dt
     * @return
     * @throws Exception 
     */   
    public boolean openDoor(DoorTypes dt) throws Exception {
        boolean Result = false;
        
        //Получаем список дверей из модели
        HashMap <DoorTypes, Door> doors_temp = model.getDoors();
        //Для нужной двери, если она есть
        if( doors_temp.containsKey(dt) ) {
            //Выполняем операцию открытия
            doors_temp.get(dt).open();
            Result = true;
        } else {
            throw new Exception("Двери типа "+dt.name()+" не существует");
        }
        
        return Result;
    }
    
}
