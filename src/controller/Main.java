/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;
import model.Body;
import model.doors.Dictionaries;
import model.doors.Dictionaries.DoorTypes; 
import model.doors.Door;
import view.Menu;
import view.ShowModelParams;

/**
 *
 * @author Андрей
 */
public class Main {
    
    Body model;
    Menu view;
    ShowModelParams SMP;
    Scanner in = new Scanner(System.in);
    
    public Main(Body model, Menu view, Properties prop) {
        this.model = model;
        this.view = view;
        this.SMP = new ShowModelParams(this.model);
    }
    
    
    
    /**
     * Открываем дверь заданную аргументом dt
     * @param dt
     * @return
     * @throws Exception 
     */   
    private boolean changeDoor(DoorTypes dt, boolean open) throws Exception {
        boolean Result = false;
        
        //Получаем список дверей из модели
        HashMap <DoorTypes, Door> doors_temp = model.getDoors();
        //Для нужной двери, если она есть
        if( doors_temp.containsKey(dt) ) {
            if( open ) {
                //Выполняем операцию открытия
                doors_temp.get(dt).open();
                //Включаем лампочку открытой двери
                model.setOpenDoorLamp(true);
            } else {
                //Выполняем операцию закрытия
                doors_temp.get(dt).close();
                //Включаем лампочку открытой двери
                model.setOpenDoorLamp(false);            
            }
            //Сигнализируем об успешности действия
            System.out.println("Выполнено");
            SMP.openDoorLamp();
            Result = true;
            
        } else {
            throw new Exception("Двери типа "+dt.name()+" не существует");
        }
        
        return Result;
    }
    
    /**
     * 
     * @param dt
     * @return
     * @throws Exception 
     */
    public boolean openDoor(DoorTypes dt) throws Exception {
        return changeDoor(dt, true);
    }

    /**
     * 
     * @param dt
     * @return
     * @throws Exception 
     */
    public boolean closeDoor(DoorTypes dt) throws Exception {
        return changeDoor(dt, false);
    }    
    
    /**
     * Главное меню
     * @return 
     */
    public boolean swichMenu() {
        boolean Result = true;
                
        try {
            view.showMenu();
            switch ( Integer.parseInt(in.nextLine()) )  {
                case 0: 
                    Result = false;
                break;                
                case 1:
                    //Показываем "состояние модели".
                    SMP.showModelParams();
                    //Предлагаем нажать любую клавишу для продолжения
                    enyKey();
                break;                
                case 2:
                    //Выполняем открытие двери
                    openDoor(Dictionaries.DoorTypes.FrontLeftDoor);
                    //Предлагаем нажать любую клавишу для продолжения
                    enyKey();                    
                break;
                case 3:
                    //Выполняем закрытие двери
                    closeDoor(Dictionaries.DoorTypes.FrontLeftDoor);
                    //Предлагаем нажать любую клавишу для продолжения
                    enyKey();
                break;
                default: throw new NumberFormatException();
            }
            
        } catch (NumberFormatException e) {
            System.err.println("Введен неверный номер пункта меню");
            //Result = swichMenu();
        }
        catch (Exception e) {
            System.err.println("Ошибка: "+e.getMessage());
            //Result = swichMenu();
        }
        
        return Result;
    }
    
    /**
     * Останавливаем выполнение программы, чтобы пользователь успел посмотреть
     * предыдущий вывод перед дальнейшими действиями
     */
    private void enyKey() {
        System.out.println("Нажмите любую клавишу >>>");
        in.nextLine();
    }
    
    
    
}
