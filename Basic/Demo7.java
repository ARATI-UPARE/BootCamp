import java.util.*;

class Demo7
{
	public static void main(String arg[])
	{
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter Range of summmaton");	
	 int start=s.nextInt();
	 int end=s.nextInt();
	 int sum=start;
	 
	 for(int i=start;i<=end;i++)
	 {
	 sum=sum+i;
	 }	
	 System.out.println("Summation of nos is"+sum);
	}
}