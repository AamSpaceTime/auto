/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import controller.ErrMsgLog;
import controller.Main;
import java.io.IOException;
import java.util.Properties;
import model.Body;
import view.Menu;

/**
 *
 * @author Андрей
 */
public class Common {
    
    public static Body model;
    public static Main controller;
    public static Menu view;
    public static Properties prop;
    public static ErrMsgLog myerr;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {       
        /*
            0. Загружаем данные конфигурации
            1. Инициализируем модель
            2. Инициируем представление
            3. Инициализируем контроллер и передаем туда модель и представление
            4. Запускаем бесконечный цикл в котором просматриваем результат меню на выход
        */
                    
        try {
            myerr = new ErrMsgLog();
            prop = new Properties();
            Preloader PRL = new Preloader("config.ini", prop); 
            model = new Body();
            view = new Menu();
            controller = new Main(model, view, prop, myerr);
            boolean run = true;        

            while(run) {            
                run = controller.swichMenu();
            }
        } catch (Exception e) {
           myerr.addErrWithLog(e); //Добавляем ошибку в список и пишем в лог без отображения в консоли
           myerr.showErrText(e); //Отображаем ошибку
           //System.err.println("Ошибка - "+e);
        }
    }
    
}
