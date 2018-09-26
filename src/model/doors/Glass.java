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
public class Glass extends Detal {
    
    public DoorTypes Type; //Тип стекла
    private boolean open; //Признак открытого/закрытого стекла
    
    /**
     * 
     * @param Type 
     */
    public Glass(DoorTypes Type) {
        this.Type = Type;
        this.open = false;
    }
    
    /**
     * Открываем окно
     */
    public void open() {
        open = true;
    }
    
    /**
     * Закрываем окно
     */
    public void close() {
        open = false;
    }
    
    /**
     * Возвращаем открыто или закрыто окно
     * @return 
     */
    public boolean checkOpen() {
        return open;
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
