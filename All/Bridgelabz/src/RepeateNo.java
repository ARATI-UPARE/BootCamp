import java.util.Scanner;

public class RepeateNo
{
	public static void Repeated(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			//count=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j]&&i!=j)
				{
					//count++;
					System.out.print(arr[i]+"  ");
				}
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
	    Repeated(arr,size);
		//System.out.println("Total Distinct No.s in array are:  "+dist);
		s.close();
	}

	

}
