import java.util.*;

class Demo10
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number");	

        int no=s.nextInt();
		
		if(no<=0)
		{
		System.out.println("Invalid Number");
		}
		else
		{
		 int fact=1;
		 for(int i=no;i>=1;i--)
		 {
		 fact=fact*i;
		 }
		 System.out.println("Factorial of no is  "+ fact);
		 }
		 
	}
	
}
		 