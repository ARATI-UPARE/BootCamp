import java.util.*;

public class SmallerNo
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
		int small=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]<small)
			{
			small=arr[i];
			}
	    }
	
		System.out.println("Smallest element of array is  "+small);
	}
}