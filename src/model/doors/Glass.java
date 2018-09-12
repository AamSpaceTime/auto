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
public class Glass {
    
    public static enum TypeList {
            FrontLeftDoor,
            FrontRightDoor,
            BackLeftDoor,
            BackRightDoor
    };
    
    public String Type;
    
    Glass(String temp) {
        Type = temp;
    }
    
    
    
    public void setType(String temp) {
        Type = temp;
    }
    
}
