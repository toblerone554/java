/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author alonso
 */
public class EntradaTeclado 
{
  public static void main(String[]args)
 
  {
      //int a = 1;
      
      //System.out.println("Vamos a adivinar un numero del uno al cinco");
      
      Scanner in= new Scanner(System.in);
      
      int damenumero; 
      
      System.out.println("Dame un numero");
      
      damenumero=in.nextInt();
      
      System.out.printf("Tu numero es " + damenumero);
  }               
    
}
