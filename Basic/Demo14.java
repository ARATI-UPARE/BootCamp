import java.util.*;

class Demo14
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number");	

        int no=s.nextInt();
		int idigit=0,sum=0;
		int org=no;
		while(no>0)
		{
		  idigit=no%10;
		  sum=sum+(idigit*idigit*idigit);
		  no=no/10;
		}
		
		if(sum==org)
		{
		System.out.println("Given no is Armstrong no.");
		}
		else
		{
		System.out.println("Given no is not Armstrong no");
		}
	}
}
		
		  