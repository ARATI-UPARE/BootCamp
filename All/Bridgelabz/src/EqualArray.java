import java.util.*;

public class EqualArray
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
		
		System.out.println("Enter the size of array");
		int size2=s.nextInt();
		System.out.println("Enter the elemnts of array");
		for(int i=0;i<size2;i++)
		{
			brr[i]=s.nextInt();
		}
		
		
		if(Arrays.equals(arr,brr))
		{
		System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Given arrays are not equal");
		}
	}
}