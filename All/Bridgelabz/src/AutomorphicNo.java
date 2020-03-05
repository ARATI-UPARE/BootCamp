import java.util.*;

public class AutomorphicNo
{
 public static void main(String arg[])
 {
     Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter number");
	 
	 int no=s.nextInt();
	 int org=no;
	 int sq=no*no;
	 int cnt=1;
	 
	 while(no>0)
	 {
		 cnt=cnt*10;
		 no=no/10;
		 
	 }
	 if((sq%cnt)==org)
	 {
		System.out.println("Number is autophormic number");
	 }
	 else
	 {
		 System.out.println("Number is not aotophormic number");
	 }

	 
	 }
}
