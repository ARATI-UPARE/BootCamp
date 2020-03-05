import java.util.*;

class Demo8
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number");	

        int no=s.nextInt();
		int i=0,icnt=0;
		for(i=1;i<=no/2;i++)
		{
			if((no%i)==0)
			{
				icnt++;
			}
		}
		
		if(icnt==1)
		{
			System.out.println(" Number is prime no");	
		}
		else
		{
			System.out.println(" Number is not prime no");	
		}
	}
}