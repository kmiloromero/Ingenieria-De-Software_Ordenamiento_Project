/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.TxtClass;

/**
 *
 * @author user
 */
public class Controller {
    
    TxtClass txt = new TxtClass();
    //Metodos Void Para Control de Archivo

    public void ControladorPath(String path) {
       txt.asignacionpath(path);
    }

    public void conectarEscritura(int identificador) {
        txt.mLectura(identificador);
    }
    
    
    
}
