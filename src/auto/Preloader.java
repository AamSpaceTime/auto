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
import java.util.Properties;

/**
 *
 * @author Андрей
 */
public class Preloader {
    
    public Preloader(String FileName, Properties props) throws IOException {
        getConfigFile(FileName, props);
    }    
    
    private static void getConfigFile(String FileName, Properties props) throws FileNotFoundException, IOException {
        File f = new File(FileName);
        //System.out.println(f.exists()+" "+f.canRead()+" "+f.canWrite()+" "+f.getAbsolutePath());
        FileInputStream fs = new FileInputStream(f);
        props.load(fs);
        System.out.println(props.getProperty("Name"));
        
    }    
    
}
