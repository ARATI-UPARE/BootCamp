import java.util.*;

class Demo19
{
  public static void main()
   {
     Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter the Number");
	 
	 int no=s.nextInt();
	 
	 for(int i=1;i<=no;i++)
	 {
	  if(no%i==0)
	   {
	    System.out.println(i);
	   }
	 }
   }
}
	 