
public class CircularLL 
{
	CNode Head=null;
	CNode Tail=null;
	static int size=0;
	
	public void Insert(int no)
	{
		CNode newn=new CNode();
		newn.data=no;
		newn.next=null;
		
		if((Head==null)&&(Tail==null))
		{
			Head=newn;
			Tail=newn;
			size++;
		}
		else
		{
			newn.next=Head;
			Head=newn;
			size++;
		}
		Tail.next=Head;
	}
	
	public void Display()
	 {
		      CNode temp=Head;
		      if((Head==null)&&(Tail==null))
		      {
		    	  return;
		      }
		      else
		      {
		     System.out.println("size of LinkedList is: "+size);
			 System.out.print("Elements of LinkedList is:");
			 
			 do
			 {
				 System.out.print("  "+temp.data);
				 temp=temp.next;
			
			 }while(temp!=Tail.next);
			 
			 //System.out.print("  "+temp.data);
			 System.out.println();
		     }
	  }

	
	public void Rotate(int k)
	{
		CNode temp=Head;
		System.out.println(Head.data);
		System.out.println(Tail.data);
		for(int i=1;i<k-1;i++)
		{
			temp=temp.next;
		}
		Head=temp.next;
		Tail=temp;
		
		System.out.println(Head.data);
		System.out.println(Tail.data);
	}
}
