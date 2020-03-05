import java.util.*;

public class PrimeNo
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
			num=min;
			icnt=0;
			for(num=min/2;num>1;num--)
			{
				if((min%num)==0)
				{
					icnt++;
					break;
				}
			}
			if(icnt==0)
			{
				System.out.print(min+" ");
				i++;
							}
			min++;
			//i++;
		}
		
	}   
		       
}
