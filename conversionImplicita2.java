public class conversionImplicita2
{
	public static void main(String [] args) 
	
		{
			int k=5 , p;
			short s=10;
			char c='ñ';
			float h =0;
			
			System.out.println("Antes de conversiones implicitas"); 
		
			System.out.println("La variable c vale  + c\n   La variable h vale + h \n La variable k vale + k" );
			
			p=c; // Conversion implicita char a int
			h=k; // Conversion implicita int a float
			k=s; // Conversion implicita short a int
			
			
			System.out.println("Despues de conversiones implicitas"); 
			System.out.println("La variable p vale + c\n La variable h vale + h\n La variable k vale + k ");
			
			
		}


}
