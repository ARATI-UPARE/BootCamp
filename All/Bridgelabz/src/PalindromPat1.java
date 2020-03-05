import java.util.*;

public class PalindromPat1 
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enetr no.of rows");
	 int row=s.nextInt();
	 //System.out.println("Enetr no.of colounms");
	 //int col=s.nextInt();
	 int i,j;
	 
	 for(i=1;i<=row;i++)
	 {
		 for(j=i;j<=row;j++)
		 {
			 System.out.print(" ");
		 }
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(j+" ");
		 }
		 for(j=i-1;j>=1;j--)
		 {
			 System.out.print(j+" ");
		 }
		 System.out.println();
	 }
	 
 }
}
