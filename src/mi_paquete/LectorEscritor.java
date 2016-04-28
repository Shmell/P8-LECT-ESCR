

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package mi_paquete;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
*/


/**
 * Un conjundo de procesos comparten datos. Una parte de estos procesos
 * (lectores) s�lo leen los datos, mientras que el resto (escritores) leen
 *  y escriben. Varios lectores pueden acceder simultaneamente a los datos
 *  compartidos. Se debe evitar que accedan simultaneamente un proceso escritor
 *  y cualquier otro proceso.
 

public class LectorEscritor extends JApplet 
{


	private static final long serialVersionUID = 1L;
	public  LectorEscritor formulario;
        JList list;
	Documento documento;
	JTextField text;
	String txt;

        
  public LectorEscritor() 
  {

    Container cp1 = getContentPane();
    Container cp2 = new JPanel(new BorderLayout());
    list = new JList(new DefaultListModel());
    JScrollPane scrollPanel = new JScrollPane(list);

    text = new JTextField("Escribe aqu�");

    JLabel label=new JLabel(" E - Escritores, L - Lectores");
    cp2.add(label);
    cp2.add(text,BorderLayout.SOUTH);
    cp1.add(scrollPanel);
    cp1.add(cp2, BorderLayout.SOUTH);
*/
    //documento=new Documento(list);
/*
    FocusListener focusListener=new FocusListener() {
       boolean borrar=true;
       public void focusGained(FocusEvent e) {
          if(borrar) {
             borrar=false;
             text.setText("");
          }
       }
       public void focusLost(FocusEvent e) {
       }
    };
    KeyListener keyListener=new KeyListener() {
       public void keyPressed(KeyEvent e) {
          if (e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
              //new Escritor(documento).start();
          }
          if (e.getKeyChar() == 'l' || e.getKeyChar() == 'L') {
             //new Lector(documento).start();
          }
       }
       public void keyReleased(KeyEvent e) {
       }
       public void keyTyped(KeyEvent e) {
       }
    };
    text.addFocusListener(focusListener);
    text.addKeyListener(keyListener);

  }



  public void init(){
    formulario=new LectorEscritor();
  }

}

*/