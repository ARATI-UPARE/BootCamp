import java.util.Scanner;

public class Pattern16
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of row");
		int row=s.nextInt();
		int i,j;
		
		 for(i=row;i>0;i--)
		 {
			 for(j=i;j>0;j--)
			 {
				 System.out.print("*");
			 }
			 
			System.out.println();
		}
		 for(i=row-1;i>0;i--)
		 {
			 for(j=i;j<=row;j++)
			 {
				 System.out.print("*");
			 }
			 
			System.out.println();
		}
				s.close();
	}
}