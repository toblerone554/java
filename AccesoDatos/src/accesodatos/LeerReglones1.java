
package accesodatos;

/**
 *
 * @author alonso
 */
import java.io.*;
public class LeerReglones1 {

public static void main(String[] args) {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Hola, ingresa tu nombre");

String nombre= "";

try {nombre = br.readLine();}

catch (IOException ex) {
System.exit(-1);}

System.out.println("Hola, "+nombre+" ten un buen día");

System.exit(0);}
}