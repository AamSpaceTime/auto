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
    
    /**
     * number - Номер детали в реестре производителя
     */
    private Long number;
    /**
     * Links содержит связи (объекта) данной детали с другими (объектами) деталяим
     */
    private HashMap <Long, Detal> Links;
    
    /**
     * Получаем номер данной детали
     * @return 
     */
    public Long getNumber() {
        return number;
    }
    
    /**
     * Устанавливаем номер данной детали
     * @param num 
     */
    public void setNumber(Long num) {
        this.number = num;
    }
    
    /**
     * Добавляем связь с другой деталью
     * @param d 
     */
    public void addLinkDetal(Detal d) {        
        Links.put(d.getNumber(), d);
    }
    
    /**
     * Удаляем связь с другой деталью по объекту другой детали
     * @param d
     * @return 
     */
    public boolean removeLinkDetail(Detal d) {
        return removeLinkDetail(d.getNumber());
    }
    
    /**
     * Удаляем связь с другой деталью по номеру другой детали
     * @param num
     * @return 
     */
    public boolean removeLinkDetail(Long num) {
        if( Links.remove(num) == null ) {
            return false;
        } else {
            return true;
        }        
    }
    
    /**
     * Метод возвращает true, если деталь готова к использованию и false, если не готова
     * @return 
     */
    public abstract boolean checkReady();
    
    /**
     * Метод выполняет тестирование работоспособности детали на тестовых данных
     * @return 
     */
    public abstract boolean autotest();
    
    
}
