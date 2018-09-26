/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author Андрей
 */
public abstract class Detal {
    
    private Integer number;
    private HashMap <Integer, Detal> Links;
    
    public Integer getNumber() {
        return number;
    }
    
    public void setNumber(Integer num) {
        this.number = num;
    }
    
    public void addLinkDetal(Detal d) {        
        Links.put(d.getNumber(), d);
    }
    
    public boolean removeLinkDetail(Detal d) {
        return removeLinkDetail(d.getNumber());
    }
    
    public boolean removeLinkDetail(Integer num) {
        if( Links.remove(num) == null ) {
            return false;
        } else {
            return true;
        }        
    }
    
}
