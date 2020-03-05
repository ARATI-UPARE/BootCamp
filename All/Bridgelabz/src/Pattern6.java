
import java.util.Scanner;

public class Pattern6
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row=s.nextInt();
	 System.out.println("Enter the number of colounms");
	 int col=s.nextInt();
	 int i,j,k=16,l=1;
	 
	 for(i=0;i<row;i++)
	 {
		 for(j=0;j<k;j++)
		 {
			 System.out.print(" ");
			 
		 }
		 k=k-4;
		 for(j=1;j<=l;j++)
		 {
			 System.out.print("* ");

		 }
		 l=l+2;
	 System.out.println();
	 
	 }
  }
}
