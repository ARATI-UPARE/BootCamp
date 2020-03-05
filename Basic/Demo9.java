import java.util.*;

class Demo9
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter range of prime no");	

        int start=s.nextInt();
		int end=s.nextInt();
		int i=0,icnt=0;
		System.out.println("Prime no are");
		for(int j=start;j<=end;j++)
		{
		    icnt=0;
			for(i=1;i<=j/2;i++)
			{
				if((j%i)==0)
				{
				icnt++;
				}
			
			}
			if(icnt==1)
			{
			System.out.print(" "+j);
			}
			
	    }
	}
}