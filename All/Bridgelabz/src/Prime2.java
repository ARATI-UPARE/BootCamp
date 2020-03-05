import java.util.Scanner;

public class Prime2
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value");
		int no=s.nextInt();
		System.out.println("Enter Minimum value");
		int min=s.nextInt();
		
		int icnt=0,num=0,i=0;
		min=min+1;
		while(i<no)
		{
			if((min==2)||(min==3)||(min==5)||(min==7))
			{
				System.out.print(min+" ");
				i++;
			}
			if((min%7!=0)&&(min%5!=0)&&(min%3!=0)&&(min%2!=0))
			{
				System.out.print(min+" ");
				i++;
			}
			min++;
		}
		
		
	}   
		       
}
