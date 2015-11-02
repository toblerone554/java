public class conversionExplicita
{
	public static void main (String[]args)
	
	{
		char c;
		byte k;
		int p=400;
		double d=34.6;
		
		System.out.println("Antes de la conversión explicita\n");
		
		System.out.println("p vale\t " +p); 
		System.out.println("d vale\t " +d);
		
		c=(char)d; // se elimina la parte decimal (t=runcado)
		k=(byte)p; // perdida de datos, pero la conversion es posible
		
		System.out.println("Después de la conversión explicita");
		System.out.println("c vale ahora\t" +c);
		System.out.println("k vale ahora\t" +k);
	
		
	}
		



}
