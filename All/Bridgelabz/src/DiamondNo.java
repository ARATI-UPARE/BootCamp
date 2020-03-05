
import java.util.Scanner;

public class DiamondNo
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row=s.nextInt();
	
	 int i,j,k=0;
	 
	 for(i=1;i<=row;i++)
	 {
		 for(j=1;j<=row-i;j++)
		 {
			 System.out.print(" ");
		 }
		 
		for(j=1;j<=2*i-1;j++)
		 {
			 System.out.print(j);
		 }
		
	 System.out.println();
	 }
	 
	 for(i=row-1;i>0;i--)
	 {
		 for(j=1;j<=row-i;j++)
		 {
			 System.out.print(" ");
		 }
		 
		for(j=1;j<=2*i-1;j++)
		 {
			 System.out.print(j);
		 }
		
	 System.out.println();
	 
	 }
  }
}
