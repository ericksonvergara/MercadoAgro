/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SENA
 */
public class Archivo {
  
    public static void grabar (String nombre_archivo, String cadena) {
       
        
        try {
            FileWriter fw = null;
            File mayle= new File(nombre_archivo);
            fw = new FileWriter(mayle);
            fw.write(cadena);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

    