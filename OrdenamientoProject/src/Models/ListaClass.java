/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

 /*
 * @author Romero
 */
public class ListaClass {
TxtClass a = new TxtClass();
    /* se crea el metodo Nodo que será la estructura de la lista con los atributos
 * int dato que almacenara el valor numerico y apuntador que direcciona al   
 * siguiente nodo.
     */
    class Nodo {

        int dato;
        Nodo siguiente;
    }
    /*se crea un apuntador externo, el cual tendra la direcion del primer nodo*/
    private Nodo raiz = null;

    /* se crea el metodo insertar,que trae por parametro un Long numeroel cual 
 * siempre que se inserta un nodo, buscara la posicion en la lista donde 
 * debe quedar para asi buscar su ordenamiento en el momento de la insercion
     */
    public void InsercionAscendente(ArrayList lista) {
        Nodo nuevonodo = new Nodo();
        //guardamos la informacion entrante
        for(int i = 0; i < lista.size(); i++){
            nuevonodo.dato = (int) lista.get(i);
            if (raiz == null) {
                raiz = nuevonodo;
                nuevonodo.siguiente = null;
            } else {
                if ((int)lista.get(i) < raiz.dato) {
                    nuevonodo.siguiente = raiz;
                    raiz = nuevonodo;
                } else {
                    Nodo reco = raiz;
                    Nodo atras = raiz;
                    while ((int)lista.get(i) >= reco.dato && reco.siguiente != null) {
                        atras = reco;
                        reco = reco.siguiente;
                    }
                    if ((int)lista.get(i) >= reco.dato) {
                        reco.siguiente = nuevonodo;
                        nuevonodo.siguiente = null;
                    } else {
                    nuevonodo.siguiente = reco;
                    atras.siguiente = nuevonodo;
                    }
                }
            }
        }
        a.mEscritura(llamado());    
    }//fin InsercionAscendente

    public void InsercionDescendente(ArrayList lista) {
        Nodo nuevonodo = new Nodo();
        //guardamos la informacion entrante
        for(int i = 0 ; i < lista.size();i++){            
            nuevonodo.dato = (int) lista.get(i);
            if (raiz == null) {
                raiz = nuevonodo;
                nuevonodo.siguiente = null;
            } else {
                if ((int)lista.get(i) > raiz.dato) {
                    nuevonodo.siguiente = raiz;
                    raiz = nuevonodo;
                } else {
                    Nodo reco = raiz;
                    Nodo atras = raiz;
                    while ((int)lista.get(i) >= reco.dato && reco.siguiente != null) {
                        atras = reco;
                        reco = reco.siguiente;
                    }
                    if ((int)lista.get(i) <= reco.dato) {
                        reco.siguiente = nuevonodo;
                        nuevonodo.siguiente = null;
                    } else {
                        nuevonodo.siguiente = reco;
                        atras.siguiente = nuevonodo;
                    }   
                }
            }
        }
       a.mEscritura(llamado());    
    }//fin InsercionDescendente
    
    public ArrayList llamado() {
        ArrayList listaO = null;
        Nodo reco = raiz;
        while (reco.siguiente != null) {             
            listaO.add(reco.dato);
            reco = reco.siguiente;
             }
        return listaO;
        } 
    }//fin LiataClass

