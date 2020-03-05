import java.util.Scanner;

public class ReverseArray
{
	public static void main(String arg[])
	{
		int arr[]=new int[50];
		int brr[]=new int[50];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size1=s.nextInt();
		System.out.println("Enter the elemnts of array");
		for(int i=0;i<size1;i++)
		{
			arr[i]=s.nextInt();
		}
		int j=0;
		for(int i=size1-1;i>=0;i--)
		{
			brr[j]=arr[i];
			j++;
		}
		
		System.out.println("Reverse array is:");
		for(int i=0;i<size1;i++)
		{
			System.out.print(" "+brr[i]);
		}
	}
}