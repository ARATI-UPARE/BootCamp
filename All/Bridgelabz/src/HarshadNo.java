import java.util.Scanner;

public class HarshadNo
{
 public static void main(String arg[])
 {
     Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter number");
	 
	 int no=s.nextInt();
	 int org=no;
	 int idigit=0;
	 int sum=0;
	 
	 while(no>0)
	 {
		 idigit=no%10;
		 sum=sum+idigit;
		 no=no/10;
	 }
	 
	 if((org%sum)==0)
	 {
		System.out.println("Number is Harshad number");
	
	 }
	 else
	 {
		 System.out.println("Number is not Harshad number");
	 }

	 
   }
}

