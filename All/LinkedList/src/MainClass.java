import java.util.*;

public class MainClass
{
	public static void main(String arg[])
	{
		//LinkedList lobj=new LinkedList();
		Scanner s=new Scanner(System.in);
		//lobj.InsertFirst(40);
		//lobj.InsertFirst(30);
		//lobj.InsertFirst(20);
		//lobj.InsertFirst(10);
		//lobj.InsertLast(50);
		//lobj.InsertLast(60);
		//lobj.Display();
		
		//lobj.RemovebyValue(20);
		//lobj.Display();
		
		//lobj.Fibonnaci(150);
		//lobj.Display();
		LinkedList LL1=new LinkedList();
		LinkedList LL2=new LinkedList();
		LinkedList LL3=new LinkedList();
		System.out.println("Enter first number");
		int no1=s.nextInt();
		System.out.println("Enter second number");
		int no2=s.nextInt();
		LL1.Reverse(no1);
		LL2.Reverse(no2);
		int sum=0,sum1=0,carry=0;
		while((LL1.Head.next!=null)&&(LL1.Head.next!=null))
		{
			
			sum=LL1.Head.data+LL2.Head.data;
			sum=sum1+sum;
			carry=0;
			if((sum>9))
			{
				carry=sum%10;
				sum=sum/10;
				sum1=sum;
				LL3.InsertLast(carry);
			}
			else
			{
			LL3.InsertLast(sum);
			}
			//c=carry;
			
			LL1.Head=LL1.Head.next;
			LL2.Head=LL2.Head.next;
		 }
		
		sum=LL1.Head.data+LL2.Head.data+sum1;
		LL3.InsertLast(sum);
		LL3.Display();
		LinkedList LL4=new LinkedList();
		while(LL3.Head!=null)
		{
		LL4.InsertFirst(LL3.Head.data);
		LL3.Head=LL3.Head.next;
		}
		
		LL4.Display();
	}

}
