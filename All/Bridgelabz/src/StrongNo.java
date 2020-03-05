import java.util.*;

public class StrongNo
{
 public static void main(String arrg[])
 {
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter number");
	 
	 int no=s.nextInt();
	 
	 
	 int sum=0,fact=0;
	 int org=no;
	 
	 while(no>0)
	 {
		 fact=1;
		 int idigit=no%10;
		 
	  for(int j=idigit;j>0;j--)
	  {
		  fact=fact*j;
		  
	  }
	  sum=sum+fact;
	  no=no/10;
	  
	 }
	 
	 if(sum==org)
	 {
		 System.out.println("Number is strong number");
	 }
	 else
	 {
		 System.out.println("Number is not strong number");
	 }
 }
	 
}
