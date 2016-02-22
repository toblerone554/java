
package accesodatos;

/**
 *
 * @author alonso
 */
import java.io.*;
public class LeerReglones2 {

public static void main(String[] args) {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


String nombre= "";
int edad=0;
char categoria='a';
try {
    System.out.println("Nombre:?");
        nombre = br.readLine();
    System.out.println("Edad:?");
     edad=Integer.parseInt(br.readLine());     }

 catch (IOException ex) {
        System.exit(-1);
    }

if(edad>25){categoria='b';}
if(edad>50){categoria='c';}
edad=edad+10; 
    System.out.println(nombre+" de Categoria "+categoria+ " en una decada tendra "+edad+" años");


System.exit(0);}
}