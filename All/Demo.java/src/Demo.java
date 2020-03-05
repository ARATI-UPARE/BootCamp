import myPackage.PK;
import java.lang.*;
import java.util.*;

public class Demo
{
 public static void main(String arg[])
 {
	StringBuffer str=new StringBuffer ("ecbsdhhj");
	StringBuffer sb;
	System.out.println(str);
	String s=str.toString();
	System.out.println(s);
	sb=new StringBuffer("pqsr");
	System.out.println(sb);
	PK obj=new PK();
	int ret=0;
	ret=obj.add(4,5);
	System.out.println(ret);
 }
}