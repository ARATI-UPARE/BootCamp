import java.util.*;

public class SecondLarge
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
		int temp =0;
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Large no is "+arr[1]);
	}
}
