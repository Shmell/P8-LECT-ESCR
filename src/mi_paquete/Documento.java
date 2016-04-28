/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_paquete;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

class Documento {
  private int escritores = 0;
  private int lectores = 0;
  JTextArea list;

  public void mensaje(String mensaje) {

   /* DefaultListModel listModel = new DefaultListModel();
    listModel = (DefaultListModel) list.getModel();
    listModel.addElement(mensaje);
    list.setModel(listModel);*/
   list.append(mensaje+"\n");
   
}



  public Documento(JTextArea list) {
    this.list=list;
  }


  public synchronized void entrar_lector(int numero) {

    mensaje("Lector "+numero +"\tESPERANDO");
    while (escritores > 0) {
      try {
        wait();
      }
      catch (InterruptedException e) {}
    }
    lectores++;
  }

  public synchronized void salir_lector(int numero) {
    mensaje("Lector "+numero +"\t\t\tTERMINA");
    lectores--;
    notify();
  }

  public synchronized void entrar_escritor(int numero) {
    mensaje("Escritor "+numero+ "\tESPERANDO");
    while (lectores > 0 || escritores > 0) {
      try {
        wait();
      }
      catch (InterruptedException e) {}
    }
    escritores++;
  }

  public synchronized void salir_escritor(int numero) {
    mensaje("Escritor "+numero+"\t\t\tTERMINA");
    escritores--;
    notify();
  }
}

