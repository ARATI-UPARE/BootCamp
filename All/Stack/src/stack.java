//import java.util.*;

class Pstack
{
	private class Node
	{
		int data;
		Node link;
	}
	
	Node top;
	Pstack()
	{
		this.top=null;
	}
	
	public void push(int x)
	{
		Node temp=new Node();
		
		if(temp==null)
		{
			System.out.println("Heap overflow");
			return;
		}
		
		temp.data=x;
		temp.link=top;
		top=temp;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			return top.data;
		}
		else
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void pop()
	{
		if(top==null)
		{
			System.out.println("Stack Underflow");
		}
		top=top.link;
	}
	
	public void display()
	{
		if(top==null)
		{
			System.out.println("Stack underflow");
			
		}
		else
		{
			Node temp=top;
			
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.link;
			}
		}
	 }
}
public class stack 
{
	public static void main(String arg[])
	{
		Pstack sp=new Pstack();
		
		sp.push(10);
		sp.push(20);
		sp.push(30);
		sp.push(40);
		sp.push(50);
		sp.display();
		
		System.out.println(sp.peek());
		
		sp.pop();
		sp.pop();
		sp.display();
		System.out.println(sp.peek());		
	}

}
