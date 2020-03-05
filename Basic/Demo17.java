import java.util.*;

class Demo17
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=s.nextInt();
		System.out.println("Enter the exponent");
		int exp=s.nextInt();
		
		int power=1;
		
		for(int i=exp;i>0;i--)
		{
			power=base*power;
		}
		
		System.out.println("Power of no.is "+power);
	}
}
		
 
 