import java.util.*;

class Node
{
	int key;
	Node next;
	
	public Node(int key)
	{
		this.key=key;
		this.next=null;
		
	}
}
class PQueue 
{

	public Node front,rear;
	
	public PQueue()
	{
		this.front=this.rear=null;
	}
	
	void enqueue(int key)
	{
		Node temp=new Node(key);
		
		if(this.rear==null)
		{
			this.front=this.rear=temp;
			return;
		}
		
		this.rear.next=temp;
		this.rear=temp;
	}
	
	void dequeue()
	{
		if(this.front==null)
		{
			return;
			
		}
		
		Node temp=this.front;
		this.front=this.front.next;
		
		if(this.front==null)
		{
			this.rear=null;
		}
	}
}

public class Queue
{
	public static void main(String arg[])
	{
		PQueue q=new PQueue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.dequeue();
		
		System.out.println("Queue front element is: "+q.front.key);
		System.out.println("Queue rear element is: "+q.rear.key);



	}
}
