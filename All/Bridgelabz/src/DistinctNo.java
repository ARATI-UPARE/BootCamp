import java.util.*;

public class DistinctNo 
{
	public static int DCount(int []arr,int n)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			int j=0;
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
			}
			if(i==j)
			{
				res++;
			}
		}
		System.out.println();
		return res;
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
		int dist =DCount(arr,size);
		System.out.println("Total Distinct No.s in array are:  "+dist);
		s.close();
	}

}
