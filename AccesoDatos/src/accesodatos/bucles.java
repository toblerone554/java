/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author alonso
 */
public class bucles {
    
public static void main(String[] args){

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String nombre ="";
float examen= '0';
int numero ='1';
float media= examen/10; 

try {
    System.out.println("Nombre:?");
        nombre = br.readLine();
for (int contador1=1;contador1<=10;contador1++){
    System.out.println("Examen:"+numero);
     examen=Integer.parseInt(br.readLine());
     numero=numero+1; 
}
     
}

catch(Exception ex){ex.printStackTrace(System.err);System.exit(-1);

}
 

    System.out.println(nombre+"tu nota media es de "+ media);
}

}