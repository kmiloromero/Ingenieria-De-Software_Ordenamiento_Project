/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapackage;

/**
 *
 * @author Romero
 */
public class ListaClass {

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
    public void InsercionAscendente(double numero) {
        Nodo nuevonodo = new Nodo();
        //guardamos la informacion entrante
        nuevonodo.dato = (int) numero;
        if (raiz == null) {
            raiz = nuevonodo;
            nuevonodo.siguiente = null;
        } else {
            if (numero < raiz.dato) {
                nuevonodo.siguiente = raiz;
                raiz = nuevonodo;
            } else {
                Nodo reco = raiz;
                Nodo atras = raiz;
                while (numero >= reco.dato && reco.siguiente != null) {
                    atras = reco;
                    reco = reco.siguiente;
                }
                if (numero >= reco.dato) {
                    reco.siguiente = nuevonodo;
                    nuevonodo.siguiente = null;
                } else {
                    nuevonodo.siguiente = reco;
                    atras.siguiente = nuevonodo;
                }
            }
        }
    }

    public void InsercionDescendente(double numero) {
        Nodo nuevonodo = new Nodo();
        //guardamos la informacion entrante
        nuevonodo.dato = (int) numero;
        if (raiz == null) {
            raiz = nuevonodo;
            nuevonodo.siguiente = null;
        } else {
            if (numero > raiz.dato) {
                nuevonodo.siguiente = raiz;
                raiz = nuevonodo;
            } else {
                Nodo reco = raiz;
                Nodo atras = raiz;
                while (numero >= reco.dato && reco.siguiente != null) {
                    atras = reco;
                    reco = reco.siguiente;
                }
                if (numero <= reco.dato) {
                    reco.siguiente = nuevonodo;
                    nuevonodo.siguiente = null;
                } else {
                    nuevonodo.siguiente = reco;
                    atras.siguiente = nuevonodo;
                }
            }
        }
    }

    public void imprimir(){
        Nodo reco = raiz;
        while(reco.siguiente != null){
            System.out.println(reco.dato + " - ");
            reco = reco.siguiente;            
        }
        System.out.println();
    }    
}