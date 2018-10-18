/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Андрей
 */
public class Preloader {
    
    public Preloader(String FileName, Properties props) throws IOException, Exception {
        getConfigFile(FileName, props);
        Preloader.class.getResource("config.ini");
    }
    
    private static void getConfigFile(String FileName, Properties props) throws FileNotFoundException, IOException, Exception {        
        InputStream fs;
        try {
            File f = new File(FileName);
            //System.out.println(f.exists()+" "+f.canRead()+" "+f.canWrite()+" "+f.getAbsolutePath());
            if(f.exists()) {                
                fs = new FileInputStream(f);                
            } else {
                fs = Preloader.class.getResourceAsStream(FileName);
            }
            props.load(fs);
            System.out.println("Конфигурация загружена");
            fs.close();
        } catch (FileNotFoundException e) {
            System.err.println("Конфигурационный файл не найден. Ошибка - "+e.getMessage());
        } catch (IOException e) {
            System.err.println("Конфигурационный файл не читается. Ошибка - "+e.getMessage());
        } catch (Exception e) {
            throw new Exception("Ошибка загрузки конфигурационного файла. Ошибка - "+e.getMessage());
        }
        
    }    
    
}
