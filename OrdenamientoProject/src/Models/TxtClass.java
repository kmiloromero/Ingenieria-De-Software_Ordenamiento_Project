/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Group 2
 */
public class TxtClass {

    private String path = "";
    private ListaClass ordenamiento;
    File archivo = null;
    FileReader leerArchivo = null;
    BufferedReader lectorArchivo = null;
    FileWriter escribirArchivo = null;
    PrintWriter escritorFichero = null;

    public ArrayList mLectura() {

        ArrayList lista = new ArrayList();
        try {
            // Lectura de Fichero con Filereader
            path = "C:\\Users\\secar\\Downloads\\prueba.txt";
            archivo = new File(path);
            leerArchivo = new FileReader(archivo);
            lectorArchivo = new BufferedReader(leerArchivo);
            String cadena;
            while ((cadena = lectorArchivo.readLine()) != null) {
                lista.add(cadena);
            }
            //Escritura de Fichero
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != lectorArchivo) {
                    lectorArchivo.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        ordenamiento.InsercionAscendente(lista);

        return null;
    }

    public ArrayList mEscritura(ArrayList lista) {
        try {
            String path = "C:\\Users\\secar\\Downloads";
            ArrayList Archivo = lista;
            escribirArchivo = new FileWriter(path, true);
            escritorFichero = new PrintWriter(escribirArchivo);
            System.out.println("Escribiendo en Fichero...");
            
            while (Archivo != null) {
                escritorFichero.println(Archivo);
                
                
            }
            escritorFichero.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
