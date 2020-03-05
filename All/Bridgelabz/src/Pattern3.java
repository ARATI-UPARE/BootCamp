import java.util.Scanner;

public class Pattern3
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row=s.nextInt();
	 System.out.println("Enter the number of colounms");
	 int col=s.nextInt();
	 int i,j,k;
	 
	 for(i=1;i<=row;i++)
	 {
		 for(j=1;j<=i;j++)
		 {
			 System.out.print("*"+" ");
			 
		 }
	 System.out.println();
	 
	 }
  }
}
