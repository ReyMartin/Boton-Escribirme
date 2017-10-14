
package pruebaboton;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;


public class Boton extends JFrame{
 
    private JTextField txttexto = new JTextField("");
    private JButton  calcular = new JButton("Calcular");
    private GridLayout contenedor = new GridLayout(5,2);
    private ControladorEscribir controladorEscribir = new ControladorEscribir(txttexto, calcular);
    /* ControladorEscribir le lleva a su clase los dos objetos, asi le 
    puede definir donde lo tiene que imprimir.
    */
    
    
    public Boton (){
        this.setLayout(contenedor);
        this.setTitle("Prueba Boton");
        this.setLocation(200, 200);
        this.setSize(400, 200);
        this.setVisible(true);
        this.agregarComponente();
        this.calcular.addMouseListener(controladorEscribir);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    /*Este "setDefaultCloseOperation" frena el programa
        una vez que cierro la ventana; porque sino 
        sigue corrientdo una vez que se cerro todo y hay que 
        paralo de forma manual.
        */
    
    }
   
    public void agregarComponente(){
        this.add(calcular);
        this.add(txttexto);
        /*Este metodo no devuelve nada; solo
        agrega los dos objetos al constructor Boton.
        */
    }
    
    public String consultar_label_Boton(){
        return calcular.getText();
    /*Este es el metodo que devuelve el Label del
        boton, a travez del metodo getText
        */
    }
    
}
