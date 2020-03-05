
import java.util.*;

class BinaryToDec
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enetr Binary Number");
		
		int Binary=s.nextInt();
		int Dec=0;
		int idigit=0;
		int base=1;
		while(Binary>0)
		{
			idigit=Binary%10;
			Dec=Dec+ (idigit*base);
			Binary=Binary/10;
			base=base*2;
			
		}
		
		System.out.println("Binary to Decimal "+ Dec);
	
	s.close();
	}
	
}