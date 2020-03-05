import java.util.*;

public class NonRepeat
{
	public static void NonRepeated(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j]&&i!=j)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(arr[i]+"  ");
			}
		}
		
	}
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
		NonRepeated(arr,size);
		//System.out.println("Total Distinct No.s in array are:  "+dist);
		s.close();
	}

	

}
