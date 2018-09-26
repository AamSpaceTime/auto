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
    public static final HashMap <Long, String> DetalCodes;        
    
    static{
        //В будущем здесь будет импорт данных из файла, а пока введем напрямую
        HashMap <Long, String> LoadCodes = new <Long, String> HashMap();
        LoadCodes.put(10002010000L, DoorTypes.FrontLeftDoor.toString());
        LoadCodes.put(10002020000L, DoorTypes.FrontRightDoor.toString());
        LoadCodes.put(10002030000L, DoorTypes.BackLeftDoor.toString());
        LoadCodes.put(10002040000L, DoorTypes.BackRightDoor.toString());
        
        LoadCodes.put(10002010100L, DoorTypes.FrontLeftDoor.toString());
        LoadCodes.put(10002020100L, DoorTypes.FrontRightDoor.toString());
        LoadCodes.put(10002030100L, DoorTypes.BackLeftDoor.toString());
        LoadCodes.put(10002040100L, DoorTypes.BackRightDoor.toString());
        
        DetalCodes = (HashMap<Long, String>) LoadCodes.clone();
    }
}
