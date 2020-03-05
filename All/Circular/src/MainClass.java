import java.util.*;
import java.io.*;


public class MainClass
{
 public static void main(String arg[])
 {
	 CircularLL obj=new CircularLL();
	 
	 obj.Insert(10);
	 obj.Insert(20);
	 obj.Insert(30);
	 obj.Insert(40);
	 obj.Insert(50);
	 obj.Display();
	 System.out.println();
	 obj.Rotate(3);
	 obj.Display();
	 
	 
 }
}
