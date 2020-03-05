import java.util.Scanner;

public class Pattern14
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of row");
		int row=s.nextInt();
		
		
		int i,j;
		
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
		s.close();
	}
}