import java.util.Scanner;

public class FriendlyPair
{
 public static void main(String arrg[])
 {
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter two numbers");
	 
	 int no1=s.nextInt();
	 int no2=s.nextInt();
	 
	 int sum1=0,sum2=0;
	 		 
	 for(int j=1;j<=no1/2;j++)
	  {
		  if((no1%j)==0)
		  {
			  sum1=sum1+j;
		  }
	   }
	 
	 for(int j=1;j<=no2/2;j++)
	  {
		  if((no2%j)==0)
		  {
			  sum2=sum2+j;
		  }
	   }
	  
	 
	 if((sum1==no2)&&(sum2==no1))
	 {
		 System.out.println("Numbers Friendly pair");
	 }
	 else
	 {
		 System.out.println("Numbers are not Friendly pair");
	 }
   }
	 
}

