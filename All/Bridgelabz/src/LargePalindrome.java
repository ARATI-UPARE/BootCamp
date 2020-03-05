import java.util.*;
public class LargePalindrome
{
	public int largest(int arr[],int size)
	{
		int idigit,i,j;
		
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
        int large=largest(arr,size);
        if(large==-1)
        {
        	System.out.println("No Palindrome no");
        }
        else
        {
        	System.out.println("Largest Palindrome no is  "+large);
        }
	}
}