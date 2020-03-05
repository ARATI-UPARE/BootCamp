import java.io.*;
import java.util.*;
class Demo2
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter Number");
		
		int no=s.nextInt();
		
		if((no%2)==0)
		{
		System.out.println("No is Even");
		}
		else
		{
		System.out.println("No.is Odd");
		}
	}	
		
}
