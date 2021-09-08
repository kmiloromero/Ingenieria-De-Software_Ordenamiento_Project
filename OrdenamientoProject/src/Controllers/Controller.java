package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import view.interfaz;
import models.ListaClass;
import models.TxtClass;
/**
 *
 * @author Bradl
 */
public class Controlador implements ActionListener{
    
    private interfaz view;
    private ListaClass modListaClass;
    private TxtClass modTxtClass;
    
    public Controlador(interfaz view, ListaClass modListaClass, TxtClass modTxtClass){
        this.view=view;
        this.modListaClass = modListaClass;
        this.modTxtClass = modTxtClass;
        this.view.Bt_Abrir.addActionListener(this);
    }
    
    public void iniciar(){
        //view.Bt_Abrir.setEnabled(false);
        view.L_Error.setVisible(false);
        view.setTitle("Ordenar desde archivo");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        String ruta = fileChooser.getSelectedFile().getAbsolutePath();
       
        modTxtClass.LecturaTxt(ruta);
       // view.TA_desorden.setText(String.valueOf(modListaClass.imprimir()));
       
        if(view.RB_Ascendente.isSelected()){
            
            view.Bt_Abrir.setEnabled(true);
            modListaClass.InsercionAscendente(0);
        //    view.TA_ordenado.setText(String.valueOf(modListaClass.imprimir()));
        }else{
            if(view.RB_Descendente.isSelected()){
                
                view.Bt_Abrir.setEnabled(true);
                modListaClass.InsercionDescendente(0);
        //        view.TA_ordenado.setText(String.valueOf(modListaClass.imprimir()));

            }else{
                view.L_Error.setVisible(true);
            }
        }
    }
}
