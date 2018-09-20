/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Body;

/**
 *
 * @author Aam
 */
public class Menu {
    
    public static final HashMap <Integer, String> MainMenu;
    static{
        
        MainMenu = new HashMap();                
        MainMenu.put(0, "Выйти");
        MainMenu.put(1, "Показать модель");
        MainMenu.put(2, "Открыть дверь");
        MainMenu.put(3, "Закрыть дверь");
    }

    public Menu() {
    
    }
    
    public void showMenu() {
        System.out.println("\nМеню:");
        System.out.println("-----------------------------------------");
        for(Map.Entry<Integer, String> item : MainMenu.entrySet()){         
           System.out.printf("%d.  %s \n", item.getKey(), item.getValue());
        }
        System.out.println("-----------------------------------------");
        System.out.print("Введите номер пункта:");
    }
    
}
