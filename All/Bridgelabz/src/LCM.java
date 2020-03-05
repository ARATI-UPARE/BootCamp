
import java.util.Scanner;

public class LCM
{
 public static void main(String arrg[])
 {
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter two numbers");
	 
	 int no1=s.nextInt();
	 int no2=s.nextInt();
	 
	 int check1=no1;
	 int check2=no2;
	 
	 while(check1!=check2)
	 {
		 if(check1<check2)
		 {
			 check1=check1+no1;
		 }
		 else
		 {
			 check2=check2+no2;
		 }
	 }
	 		 
	 
	 System.out.println("LCM of Number is  "+check1);
 
	 s.close(); 
 }
 
	 
}


