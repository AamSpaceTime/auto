/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.doors;

import model.Detal;
import model.doors.Dictionaries.DoorTypes;

/**
 *
 * @author Андрей
 */
public class Door extends Detal {
    
    private boolean open; //Признак открытой/закрытой двери
    protected Glass glass; //Деталь двери - стекло
    public DoorTypes Type; //Тип двери
    /*
        Имеет смысл добавлять только те детали, которые:
        1. Обрабатывает или может обрабатывать контроллер или 
        2. Имеют связи (методы для взаимодействия) с другими деталями, которые 
    */
    
    /**
     * 
     * @param Type 
     */
    public Door(DoorTypes Type, Long num) {
        open = false;
        this.Type = Type;
        this.setNumber(num);
    }    
    
    
    /**
     * Открыть дверь
     */
    public void open() {
        open = true;
    }
    
    /**
     * Закрыть дверь
     */
    public void close() {
        open = false;
    }
    
    /**
     * Проверка открытой двери
     * @return 
     */
    public boolean checkOpen() {
        return open;
    }
    
    
    /**
     * Добавить окно
     */
    public void setGlass(DoorTypes Type, Long num) {
        glass = new Glass(Type, num);
    }
    
    /**
     * Открыть окно
     */
    public void openGlass() {
        glass.open();
    }
    
    /**
     * Закрыть окно
     */
    public void closeGlass() {
        glass.close();
    }
    
    /**
     * Проверка окна
     * @return 
     */
    public boolean checkOpenGlass() {
        return glass.checkOpen();
    }

    @Override
    public boolean checkReady() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean autotest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
