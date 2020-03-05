
import java.util.Scanner;

public class Pattern5
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row=s.nextInt();
	 System.out.println("Enter the number of colounms");
	 int col=s.nextInt();
	 int i,j,k=8;
	 
	 for(i=0;i<row;i++)
	 {
		 for(j=0;j<k;j++)
		 {
			 System.out.print(" ");
			 
		 }
		 k=k-2;
		 for(j=0;j<=i;j++)
		 {
			 System.out.print("* ");

		 }
	 System.out.println();
	 
	 }
	 
	 for(i=row-1;i>0;i--)
	 {
		 for(j=i;j>k-1;j--)
		 {
			 System.out.print(" ");
			 
		 }
		 k=k-2;
		 for(j=i;j>0;j--)
		 {
			 System.out.print(" *");

		 }
	 System.out.println();
	 
	 }
  }
}
