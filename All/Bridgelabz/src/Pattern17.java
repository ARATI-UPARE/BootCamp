import java.util.Scanner;

public class Pattern17 
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of row");
		int row=s.nextInt();
		int i,j;
		
		 for(i=1;i<=row;i++)
		 {
			 for(j=row-i;j>0;j--)
			 {
				 System.out.print(" ");
			 }
			 for(j=1;j<row-i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
	
}
