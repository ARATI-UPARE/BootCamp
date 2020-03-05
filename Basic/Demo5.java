import java.util.*;

class Demo5
{
	public static void main(String arg[])
	{
     Scanner s=new Scanner(System.in);
	  
    System.out.println("Enter three Numbers");	

    int no1=s.nextInt();
    int no2=s.nextInt();
	int no3=s.nextInt();
	

    if((no1>no2)&&(no1>no3))
    {
		System.out.println("Fist No is Greater");
	}
	else if((no2>no1)&&(no2>no3))
	{
		System.out.println("Second no is greater");
	}
	else
	{
		System.out.println("Third no is greater");
	}
	
	}

}