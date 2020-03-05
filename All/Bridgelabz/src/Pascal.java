import java.util.Scanner;

public class Pascal
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row=s.nextInt();
	
	 int i,j,k,c=1;
	 
	 for(i=0;i<row;i++)
	 {
		 for(k=1;k<=row-i;k++)
		 {
			 System.out.print(" ");
		 }
		 
		for(j=0;j<=i;j++)
		 {
			if(j==0||i==0)
			{
				c=1;
				System.out.print(" "+c);
			}
			else
			{
				c=c*(i-j+1)/j;
				System.out.print(" "+c);
			}
		 }
		
	 System.out.println();
	 }
   } 
 }