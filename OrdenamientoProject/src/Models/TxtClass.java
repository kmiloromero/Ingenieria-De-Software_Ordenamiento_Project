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

    private String path = "C:\\Users\\user\\Downloads\\prueba1.txt";
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

        int ide = identificador;
        ArrayList lista = new ArrayList();
        try {
            // Lectura de Fichero con Filereader
            String path = "C:\\Users\\user\\Downloads\\prueba1.txt";
            archivo = new File(path);
            leerArchivo = new FileReader(archivo);
            lectorArchivo = new BufferedReader(leerArchivo);
            String cadena;
            while ((cadena = lectorArchivo.readLine()) != null) {
                lista.add(cadena);
            }
            //String sLista = lista.toString();
            //System.out.println(lista.toString());
            
            if (ide == 0) {
                ordenamiento.InsercionAscendente(lista);
                System.out.println("Ordenando de Manera Ascendente");
            } else if (ide == 1) {
                ordenamiento.InsercionDescendente(lista);
                System.out.println("Ordenando de Manera Descendente");
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
    }

    public void mEscritura(ArrayList lista) {
        try {
            String ruta = "C:\\Users\\user\\Documentos";
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
