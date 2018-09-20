/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 *
 * @author Aam
 */
public class MenuList {
    
    /**
     *
     */
    public final HashMap <Integer, String> list;
    
    public MenuList(HashMap <Integer, String> list) {
        this.list = list;
    }
    
    public void show() {

        for(Map.Entry<Integer, String> item : list.entrySet()){         
           System.out.printf("%d.  %s \n", item.getKey(), item.getValue());
        }
        
        /*
            list.entrySet().forEach((item) -> {
            System.out.printf("%d.  %s \n", item.getKey(), item.getValue());
        });
        */                
    }
    
}
