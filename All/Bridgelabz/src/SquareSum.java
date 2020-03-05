import java.util.*;

public class SquareSum 
{
 public static void main(String arg[])
 {
	 int arr[]=new int[20];
	 int sum=0,sq=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the size of array");
	 int size=s.nextInt();
	 
	 System.out.println("Enter the elements of array");
	for(int i=0;i<size;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		sq=arr[i]*arr[i];
		sum=sum+sq;
	}
	System.out.println("Square sum of array is "+sum);
 }
}
