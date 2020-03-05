
public class Summation
{
	int sum=0,id=0;
	public void sum(Node no1,Node no2)
	{
		sum=no1.data+no2.data;
		if(sum>9)
		{
			id=sum%10;
			sum=sum/10;
			InsertFirst(id);
		}
		
	}
	
	



}
