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
public class Glass {
    
    public DoorTypes Type; //Тип стекла
    private boolean open; //Признак открытого/закрытого стекла
    
    public Glass(DoorTypes Type) {
        this.Type = Type;
        this.open = false;
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
    
}
