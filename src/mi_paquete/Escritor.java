/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_paquete;

class Escritor extends Thread 
{
  private final int DELAY=15000;
  Documento documento;
  int numero;

  public Escritor(Documento documento,int contador) 
  {
    this.documento=documento;
    numero=contador;
  }
  
  private void escribiendo() {
    documento.mensaje("Escritor "+numero+"\t\t\tESCRIBIENDO");
    try {
      sleep(DELAY);
    }catch(InterruptedException e)
    {}
    //documento.mensaje("Fin de escritura de "+"Escritor "+numero);
  }

  public void run() 
  {
    documento.entrar_escritor(numero);
    escribiendo();
    documento.salir_escritor(numero);
  }

}
