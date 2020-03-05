import java.util.*;

class Demo12
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number");	

        int no=s.nextInt();
		int idigit=0,sum=0;
		int rev=0;
		
		while(no>0)
		{
		  idigit=no%10;
		  //sum=sum+idigit;
		  rev=(rev*10)+idigit;
		  no=no/10;
		}
		System.out.println("Revresed digit is  "+rev);
	}
}
		
		  