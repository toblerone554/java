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
public class UsoSwitch 
{
  public static void main(String[]args)
 
  {
      int a = 2;
      
      System.out.println("Vamos a adivinar un numero del uno al cinco");
      
      switch (a*1)
      {
      case 1:
          System.out.println("El resultado es 1");
      break;
      case 2:
          System.out.println("El resultado es 2");
      break;
          
      default:
          System.out.println("Pues algo hay que poner");
      }
      
  }               
    
}
