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

    public void asignacionpath(String ruta) {
        this.path = ruta;
    }

    public void mLectura(int identificador) {

        ArrayList lista = new ArrayList();
        try {
            // Lectura de Fichero con Filereader
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
            switch (identificador)
            {
                case 1: identificador=0;
                ordenamiento.InsercionAscendente(lista);
                case 2: identificador=1;
                ordenamiento.InsercionDescendente(lista);
            }
        }
    }

    public void mEscritura(ArrayList lista) {
        try {
            String ruta = "C:\\Users\\secar\\Downloads";
            ArrayList Archivo = lista;
            escribirArchivo = new FileWriter(ruta, true);
            escritorFichero = new PrintWriter(escribirArchivo);
            System.out.println("Escribiendo en Fichero...");

            for (int i = 0; i < Archivo.size(); i++) {
                escritorFichero.println("-" + Archivo.get(i));
                escritorFichero.flush();
            }
            escritorFichero.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
