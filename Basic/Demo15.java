import java.util.*;

class Demo15
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Range");	

        int start=s.nextInt();
		int end=s.nextInt();
		
		int idigit=0,sum=0;
		
		for(int i=start;i<=end;i++)
	    {
			 int org=i;
             System.out.println("Armstrong no.s are");
				while(i>0)
				{
					idigit=i%10;
					sum=sum+(idigit*idigit*idigit);
					i=i/10;
				}
		
			if(sum==org)
			{
			System.out.println(i);
			}
			
		
		}
	}
	
}
		
		  