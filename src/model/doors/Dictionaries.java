/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.doors;

import java.util.HashMap;

/**
 *
 * @author Андрей
 * Справочники дверей
 */
public class Dictionaries {
    
    //Типы дверей
    public static enum DoorTypes {
        FrontLeftDoor,
        FrontRightDoor,
        BackLeftDoor,
        BackRightDoor
    };
    
    //Коды деталей
    public static final HashMap <String, Long> DetalCodes;        
    
    static{
        //В будущем здесь будет импорт данных из файла, а пока введем напрямую
        HashMap <String, Long> LoadCodes = new <String, Long> HashMap();
        /**
         * Расшифровка кода
         * 00 00 00 00 00 00 00
         * марка модель год группа подгруппа узел деталь
         */
       
        //Коды дверей
        LoadCodes.put("Door", 10_01_18_01_00_00_00L);
        LoadCodes.put("Door_"+DoorTypes.FrontLeftDoor.toString(), 10_01_18_01_00_00_01L);
        LoadCodes.put("Door_"+DoorTypes.FrontRightDoor.toString(), 10_01_18_01_00_00_02L);
        LoadCodes.put("Door_"+DoorTypes.BackLeftDoor.toString(), 10_01_18_01_00_00_03L);
        LoadCodes.put("Door_"+DoorTypes.BackRightDoor.toString(), 10_01_18_01_00_00_04L);
        
        //Коды стекол дверей        
        LoadCodes.put("Glass", 10_01_18_01_01_00_00L);
        LoadCodes.put("Glass_"+DoorTypes.FrontLeftDoor.toString(), 10_01_18_01_01_00_01L);
        LoadCodes.put("Glass_"+DoorTypes.FrontRightDoor.toString(), 10_01_18_01_01_00_02L);
        LoadCodes.put("Glass_"+DoorTypes.BackLeftDoor.toString(), 10_01_18_01_01_00_03L);
        LoadCodes.put("Glass_"+DoorTypes.BackRightDoor.toString(), 10_01_18_01_01_00_04L);
        
        //Код мотор_редуктора стеклоподъемника
        LoadCodes.put("GlassMotor", 10_01_18_01_02_00_00L);
        
        DetalCodes = (HashMap<String, Long>) LoadCodes.clone();
    }
}
