package pruebaboton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


class ControladorEscribir implements MouseListener {

     private JTextField txttexto;
     private JButton calcular;
    
    public ControladorEscribir(JTextField ptxttexto, JButton pcalcular){
        txttexto = ptxttexto;
        calcular = pcalcular;
        /*Acà entran los dos objetos que vienen de la 
        clase Boton, solo le coloco la p para saber 
        que entran por parámetro y los asigno a los 
        objetos correspondientes.
        */
                
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        

            txttexto.setText(calcular.getText());
            /* Aca le digo que al campo de texto le 
            imprima el Label del boton.
            Ese Label lo interpreto como una variable que solo
            tiene asignado un nombre,
            entonces lo interpreto asi, 
            Imprimime ese valor del Label en el 
            campo de texto que te digo.
            */
            

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
