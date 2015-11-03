public class OperadorNivelBits
{
	public static void main (String[]args)
	
		{
			int k=5; 
			int p=7;
			boolean b=true;
			long c=5;
			b = b|(++c>0);
			
			System.out.println ("b vale "+b);
			System.out.println ("c vale "+c);
			System.out.println ("k % p vale" +(k & p));
			
		
		}
	
	



}
