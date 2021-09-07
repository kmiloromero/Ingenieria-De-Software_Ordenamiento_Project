/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *
 * @author Romero
 */
public class TxtClass {
    
    private String path = "C:\\Users\\secar\\Downloads\\prueba.txt";
    private ListaClass b;

    public void mLecturayescritura(){
 
        File archivo = null;
        FileReader fr = null;
        FileWriter wr = null;
        PrintWriter pw = null;
        
    try {
         // Lectura de Fichero con Filereader
         archivo = new File (path);
         fr = new FileReader (archivo);
         
         ArrayList<String> lista = new ArrayList();
         //Escritura de Fichero
         
         
         
         
         
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
}
