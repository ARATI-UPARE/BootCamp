
public class LinkedList 
{
  Node Head=null;
  static int size=0;
 
 public void InsertFirst(int no)
 {
 	Node newn=new Node();
 	newn.data=no;
 	newn.next=null;
 	
 	if(Head==null)
 	{
 		Head=newn;
 		size++;
 	}
 	else
 	{
 	  Node temp=Head;
 	  Head=newn;
 	  newn.next=temp;
 	  size++;
 	}
 }
 
 public void InsertLast(int no)
 {
 	Node newn=new Node();
 	newn.data=no;
 	newn.next=null;
 	
 	if(Head==null)
 	{
 		Head=newn;
 		size++;
 	}
 	else
 	{
 	  Node temp=Head;
 	  while(temp.next!=null)
 	  {
 		  temp=temp.next;
  	  }
 	  
 	  temp.next=newn;
 	   size++;
 	}
 }
 
 public void Display()
 {
	      Node temp=Head;
	     System.out.println("size of LinkedList is: "+size);
		 System.out.print("Elements of LinkedList is:");
		 
		 while(temp.next!=null)
		 {
			 System.out.print("  "+temp.data);
			 temp=temp.next;
		
		 }
		 System.out.print("  "+temp.data);
		 System.out.println();
  }
 
 public void InsertAtpos(int no,int pos)
 {
	 Node newn=new Node();
	 newn.data=no;
	 newn.next=null;
	 
	 if((pos<1)&&(pos>size+1))
	 {
		 System.out.println("Invalid position");
		 return;
	 }
	 else if(pos==1)
	 {
		 InsertFirst(no);
	 }
	 else if(pos==size+1)
	 {
		 InsertLast(no);
	 }
	 else
	 {
	 Node temp=Head;
	 
	 for(int i=1;i<pos-1;i++)
	 {
		temp=temp.next; 
	 }
	 newn.next=temp.next;
	 temp.next=newn;
	 size++;
	 }
 }
 
 public void DeleteFirst()
 {
	 if(Head==null)
	 {
		 System.out.println("Nothing to delete");
		 return;
	 }
	 else
	 {
	 Head=Head.next;
	 size--;
	 }
 }
 
 public void DeleteLast()
 {
	 if(Head==null)
	 {
		 System.out.println("Nothing to delete");
		 return;
	 }
	 else
	 {
	 Node temp=Head;
	 while(temp.next.next!=null)
	 {
		 temp=temp.next;
	 }
	 temp.next=null;
	 size--;
	 }
 }
 
 public void DeleteAtpos(int pos)
 {
	 if((pos<1)&&(pos>size+1))
	 {
		 System.out.println("Invalid position");
		 return;
	 }
	 else if(pos==1)
	 {
		 DeleteFirst();
	 }
	 else if(pos==size+1)
	 {
		 DeleteLast();
	 }
	 else
	 {
	 Node temp=Head;
	 
	 for(int i=1;i<pos-1;i++)
	 {
		temp=temp.next; 
	 }
	 temp.next=temp.next.next;
	 size--;
	 }	 
  }
 
 public void Search(int no)
 {
	 Node temp=Head;
	 int i=0;
	 for(i=1;i<size;i++)
	 {
		 if(temp.data==no)
		 {
			 break;
		 }
		 temp=temp.next;
	 }
	 if(i==size)
	 {
		 System.out.println("Element not found");
	 }
	 else
	 {
		 System.out.println("Element found at: "+i);
	 }
 }
 
 
 public void Sort()
 {
	 int no=0;
	 if((Head==null)&&(Head.next==null))
	 {
		 return;
	 }
	 else
	 {
	 Node temp1=Head;
	 Node temp2=Head.next;
	 
	 while(temp1.next!=null)
	 {    
		 no=0;
		 temp2 = temp1.next;
		 while(temp2.next!=null)
		 {   
			 
			 if((temp1.data)>=(temp2.data))
			 {
				 no=temp1.data;
				 temp1.data=temp2.data;
				 temp2.data=no;
			 }
			 
			 temp2=temp2.next;
		 }
		 if(temp1.data>temp2.data)
		 {
			 no=temp1.data;
			 temp1.data=temp2.data;
			 temp2.data=no;
		 }
		 temp1=temp1.next;
	   }
	 }
	}
 
 public void RemovebyValue(int no)
 {
	 Node temp=Head;
	
	 if(Head==null)
	 {
		 return;
	 }
	 else
	 {
		 if(temp.data==no)
		 {
		 DeleteFirst();
		 }
		 else
		 {
			 
			 while(temp.next!=null)
			 {   
				 
				 if(temp.next.data==no)
				 {
					 break;
				 }
				 temp=temp.next;
			 }
			 if(temp.next==null)
			 {
				 System.out.println("Element not found to delete");
			 }
			 else
			 {
			 temp.next=temp.next.next;
			 size--;
			 }
		  }
	   }
   }
 
 public void Fibonnaci(int n)
 {
	int i=0;
	int a=0,b=1,c=0;
	
		 if (n == 0) 
	        {
	            return; 
	        }
		 					
	        for (i = 2;(b<n); i++) 
	        { 
	        	InsertLast(b);
	            c = a + b; 
	            a = b; 
	            b = c; 
	         }	         
	}

 public void Reverse(int n)
 {
	 int id=0;
	 while(n>0)
	 {
		 id=n%10;
		 InsertLast(id);
		 n=n/10;
		 
	 }
	 
	 Display();
	  
 }
 public void Reverse1(int n)
 {
	 InsertLast(n)
	  
 }
 

}
 

