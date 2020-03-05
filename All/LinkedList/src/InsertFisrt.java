
public static void Insert(int no)
{
	Node newn=new Node();
	newn.data=no;
	newn.next=null;
	
	if(Head==null)
	{
		Head=newn;
		return;
	}
	else
	{
	  int temp=head;
	  Head=newn;
	  newn=temp;
	}
}