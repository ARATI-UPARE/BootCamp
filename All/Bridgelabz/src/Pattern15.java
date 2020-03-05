import java.util.Scanner;

public class Pattern15
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of row");
		int row=s.nextInt();
		int i,j;
		
		 for(i=1;i<=row;i++)
		 {
			 for(j=i;j>0;j--)
			 {
				 System.out.print("*");
			 }
			 
			System.out.println();
		}
		 for(i=row-1;i>0;i--)
		 {
			 for(j=i;j>0;j--)
			 {
				 System.out.print("*");
			 }
			 
			System.out.println();
		}
				s.close();
	}
}