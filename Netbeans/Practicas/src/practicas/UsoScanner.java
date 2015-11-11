/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.Scanner;
/**
 *
 * @author alonso
 */
public class UsoScanner 
{
  public static void main(String[]args)
 
  {
      //int a = 1;
      
      //System.out.println("Vamos a adivinar un numero del uno al cinco");
      
      Scanner in= new Scanner(System.in);
      
      int damenumero; 

      int damenumero1; 

      String pala; 
      
      System.out.println("Dame un numero");
      
     
      damenumero=in.nextInt();
      
      System.out.println("Dame un numero");
      
      damenumero1=in.nextInt();
      
      System.out.println("Dame una palabra");
      
      pala=in.next();
      
      System.out.println("Tu numero es " + damenumero+ damenumero1 + pala);
  }               
    
}
