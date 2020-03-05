
import java.util.Scanner;

public class Floyds
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row=s.nextInt();
	
	 int i,j,k=1;
	 
	 for(i=1;i<=row;i++)
	 {
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(k+" ");
			 k++;
		 }
		
	 System.out.println();
	 
	 }
  }
}
