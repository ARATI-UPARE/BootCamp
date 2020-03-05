import java.util.*;

class Demo18
{
 public static void main(String srg[])
 {
  Scanner s=new Scanner(System.in);
  
  System.out.println("Enter No");
  
  int no=s.nextInt();
  
  for(int i=1;i<=no/2;i++)
   {
    if(no%i==0)
	{
	 System.out.print("  "+i);
	 }
   }
   
  }
}