/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import model.Body;
import model.doors.Dictionaries;
import model.doors.Door;

/**
 *
 * @author Андрей
 */
public class Scenaries {

    
    Body model;    
    private static HashMap <String, Door> doors; //Двери
    
    Scenaries(Body model) {
        this.model = model;
    }
    
}
