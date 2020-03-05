import java.util.*;

class Demo13
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number");	

        int no=s.nextInt();
		int idigit=0,rev=0;
		int org=no;
		while(no>0)
		{
		  idigit=no%10;
		  rev=(rev*10)+idigit;
		  no=no/10;
		}
		
		if(rev==org)
		{
		System.out.println("Given no is palindrome");
		}
		else
		{
		System.out.println("Given no is not palindrome");
		}
	}
}
		
		  