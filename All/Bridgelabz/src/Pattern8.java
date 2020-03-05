import java.util.Scanner;

public class Pattern8
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of row");
		int row=s.nextInt();
		
		//System.out.println("Enter no.of colounm");
		//int col=s.nextInt();
		int i,j;
		
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
					System.out.print(" * ");
			}
			   
			System.out.println();
		}
	s.close();	
	}

}
