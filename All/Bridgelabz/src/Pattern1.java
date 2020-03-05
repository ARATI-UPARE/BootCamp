import java.util.*;

public class Pattern1
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row=s.nextInt();
	 System.out.println("Enter the number of colounms");
	 int col=s.nextInt();
	 int i,j;
	 
	 for(i=0;i<row;i++)
	 {
		 for(j=0;j<col;j++)
		 {
			 System.out.print("*"+" ");
			 
		 }
	 System.out.println();
	 
	 }
  }
}
