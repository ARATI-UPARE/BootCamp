import java.util.*;

public class Permutation 
{
	public long Factorial(long no)
	{
	long i=0,fact=1;
	for(i=no;i>0;i--)
	{
		fact=fact*i;
	}
	return fact;
	}
	
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values");
		long n=s.nextLong();
		long r=s.nextLong();
		
		long per=0,num=0,dem=0,temp=0;
		
		if(n<r)
		{
			temp=n;
			n=r;
			r=temp;
		}
		
		Permutation p=new Permutation();
		
		num=p.Factorial(n);
		dem=p.Factorial(n-r);
		
		per=num/dem;
		
		System.out.println("Permutation is  "+per);
	    s.close();
	}
}
