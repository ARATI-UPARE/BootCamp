import java.util.*;

class BinaryToOctal
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enetr Binary Number");
		
		int Binary=s.nextInt();
		int Oct=0;
		int idigit=0;
		int base=1;
		while(Binary>0)
		{
			idigit=Binary%10;
			Oct=Oct+(idigit*base);
			
			base=base*2;
			Binary=Binary/10;
		}
		
		System.out.println("Binary to Octal  "+ Oct);
	
	s.close();
	}
	
}