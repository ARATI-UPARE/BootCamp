import java.util.*;

class Demo16
{
	public static void main(String arg[])
	{
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the no of fibonacci series");
	 int no=s.nextInt();
	 
	 int first=0;
	 int second=1;
	 int third=0;
	 System.out.print("Fibonacci series : "+first+" "+second);
	 
	 for(int i=1;i<=no;i++)
	 {
	   third=first+second;
	   first=second;
	   second=third;
	   System.out.print("  "+second);		  
	 }
	}
}