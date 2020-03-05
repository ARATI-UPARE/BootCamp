import java.util.*;

public class LongPalindrom 
{
	public static boolean isPalindrome(int n)
	{
		int rem,rev=0;
		int no=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(no==rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int Largest(int []arr,int n)
	{
		int i,j,temp;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=n-1;i>=0;i++)
		{
			if(isPalindrome(arr[i]))
			{
				return arr[i];
			}
		}
		return -1;
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
		int large=Largest(arr,size);
		if(large==-1)
		{
			System.out.println("There no palindome no in array");
		}
		else
		{
			System.out.println("Longest palindrome is   "+large);
	    }
		s.close();
	}

}
