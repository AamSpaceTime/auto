/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import controller.Main;
import java.util.Scanner;
import model.Body;
import model.doors.Dictionaries;
import view.Menu;

/**
 *
 * @author Андрей
 */
public class Common {
    
    public static Body model;
    public static Main controller;
    public static Menu view;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        /*
            1. Инициализируем модель
            2. Инициируем представление
            3. Инициализируем контроллер и передаем туда модель и представление
            4. Запускаем бесконечный цикл в котором просматриваем результат меню на выход
        */
        try {
            model = new Body();
            view = new Menu();
            controller = new Main(model, view);
            boolean run = true;        

            while(run) {            
                run = controller.swichMenu();
            }
        } catch (Exception e) {
            System.err.println("Ошибка -"+e.getMessage());
        }
    }
    
}
