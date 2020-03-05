
import java.util.Scanner;

public class Pattern7
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row=s.nextInt();
	 System.out.println("Enter the number of colounms");
	 int col=s.nextInt();
	 int i,j,k=0;
	 
	 for(i=1;i<=row;i++)
	 {
		 for(j=1;j<=row-i;j++)
		 {
			 System.out.print(" ");
			 
		 }
		 
		 while(k!=(2*i-1))
		 {
			 System.out.print("*");
			 k++;
		 }
		 k=0;
	 System.out.println();
	 
	 }
  }
}
