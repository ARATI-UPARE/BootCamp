import java.util.*;

class Demo3
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int no=s.nextInt();
		
		int i=0,sum=0;
		
		for(i=1;i<=no;i++)
		{
		sum=sum+i;
		}
		
		System.out.println("Sum of First N Natural no.is"+sum);
	}
}
		
		