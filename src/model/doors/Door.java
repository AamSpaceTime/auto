/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.doors;

import model.doors.Dictionaries.DoorTypes;

/**
 *
 * @author Андрей
 */
public class Door {
    
    private boolean open; //Признак открытой/закрытой двери
    protected final Glass glass; //Деталь двери - стекло
    public DoorTypes Type; //Тип двери
    /*
        Имеет смысл добавлять только те детали, которые:
        1. Обрабатывает или может обрабатывать контроллер или 
        2. Имеют связи (методы для взаимодействия) с другими деталями, которые 
    */
    
    public Door(DoorTypes Type) {
        open = false;
        glass = new Glass(Type);
        this.Type = Type;
    }
    
    public void open() {
        open = true;
    }
    
    public void close() {
        open = false;
    } 
 
    public boolean checkOpen() {
        return open;
    }

    public void openGlass() {
        glass.open();
    }
    
    public void closeGlass() {
        glass.close();
    } 
 
    public boolean checkOpenGlass() {
        return glass.checkOpen();
    }
    
}
