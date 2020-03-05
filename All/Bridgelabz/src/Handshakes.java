import java.util.*;

public class Handshakes
{
	public static void main(String arg[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter  value");
	int n=s.nextInt();
    int result=0;
    
    result=n*((n-1)/2);
    
    System.out.println(result);
    
    s.close();
	}
}
