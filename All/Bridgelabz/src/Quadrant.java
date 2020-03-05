
import java.util.*;

class Quadrant
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enetr the valueof X & Y");
		int X=s.nextInt();
		int Y=s.nextInt();
		
		if((X==0)&&(Y==0))
		{
			System.out.println("P(X,Y)lies on origin");
		}
		else if((X<0)&&(Y<0))
		{
			System.out.println("P(X,Y)lies in Third Quadrant");
		}
		else if((X>0)&&(Y>0))
		{
			System.out.println("P(X,Y)lies in First Quadrant");
		}
		else if((X<0)&&(Y>0))
		{
			System.out.println("P(X,Y)lies in Second Quadrant");

		}
		else
		{
			System.out.println("P(X,Y)lies in Fourth Quadrant");

		}
		
	s.close();
	}
	
}