
import java.util.Scanner;
public class AbundantNo
{
 public static void main(String arrg[])
 {
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter number");
	 
	 int no=s.nextInt();
	 
	 
	 int sum=0;
	 int org=no;
		 
	  for(int j=1;j<=no/2;j++)
	  {
		  if((no%j)==0)
		  {
			  sum=sum+j;
		  }
	   }
	  
	 
	 if(sum>org)
	 {
		 System.out.println("Number is Abundant number");
	 }
	 else
	 {
		 System.out.println("Number is not Abundant number");
	 }
 }
	 
}
