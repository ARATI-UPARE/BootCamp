import java.util.*;

class Demo6
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Year");	

        int year=s.nextInt();
		
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
		System.out.println("Year is leap year");
		}
		else
		{
		System.out.println("Year is not leap year");
		}
	}
}
