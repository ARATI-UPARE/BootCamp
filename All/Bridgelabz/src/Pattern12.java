import java.util.Scanner;

public class Pattern12
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of row");
		int row=s.nextInt();
		
		//System.out.println("Enter no.of colounm");
		//int col=s.nextInt();
		int i,j;
		
		for(i=0;i<row;i++)
		{
			for(j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<row;j++)
				{
					System.out.print("* ");
				}
			System.out.println();
			}
			
			s.close();
		}
		
	}


