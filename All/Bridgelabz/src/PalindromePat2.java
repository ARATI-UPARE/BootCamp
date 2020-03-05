import java.util.Scanner;

public class PalindromePat2
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enetr no.of rows");
	 int row=s.nextInt();
	 //System.out.println("Enetr no.of colounms");
	 //int col=s.nextInt();
	 int i,j,k;
	 
	 for(i=1;i<=row;i++)
	 {
		 for(j=i;j<=row;j++)
		 {
			 System.out.print(" ");
		 }
		 for(j=1;j<=i;j++)
		 {
			 System.out.print((char)(j+64)+" ");
		 }
		 for(k=i-1;k>=1;k--)
		 {
			 System.out.print((char)(k+64)+" ");
		 }
		 System.out.println();
	 }
	 
 }
}
