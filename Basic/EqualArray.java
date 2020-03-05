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
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		if(size1!=size2)
		{
		System.out.printl("Arrays are not equal");
		}
		else
		{
		for(int i=0;i<size1;i++)
		{
		 if(arr[i]!=brr[i])
		 {
		 System.out.printl("Arrays are not equal");
		 }
		}
		System.out.printl("Arrays are equal");
	}
}	