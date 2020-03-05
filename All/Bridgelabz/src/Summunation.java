import java.util.Scanner;

public class Summunation
{
	public static void main(String arg[])
	{
		int arr[]=new int[50];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		System.out.println("Enter the elemnts of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
	    }
	
		System.out.println("Summation of array is  "+sum);
	}
}