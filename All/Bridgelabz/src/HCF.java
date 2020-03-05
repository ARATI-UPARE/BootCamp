import java.util.Scanner;

public class HCF
{
 public static void main(String arrg[])
 {
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter two numbers");
	 
	 int no1=s.nextInt();
	 int no2=s.nextInt();
	 
	 int no=1;
	 		 
	 for(int i=1;(i<no1)||(i<no2);i++)
	 {
		 if(((no1%i)==0)&&((no2%i)==0))
			{
	         no=i;
			}
     }
	 System.out.println("HCF of Number is  "+no);
   }
	 
}

