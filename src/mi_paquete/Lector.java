/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_paquete;

class Lector extends Thread {
   private final int DELAY=5000;
   Documento documento;
   int numero;

   public Lector(Documento documento,int contador) {
     this.documento=documento;
     numero=contador;
   }
   private void leyendo() {
     documento.mensaje("Lector "+numero+"\t\t\tLEYENDO");
     try {
       sleep(DELAY);
     }catch(InterruptedException e)
     {}
   }

   public void run() {
     documento.entrar_lector(numero);
     leyendo();
     documento.salir_lector(numero);
   }
 }
