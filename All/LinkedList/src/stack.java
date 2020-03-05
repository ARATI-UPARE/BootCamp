import java.util.*;
import java.io.*;

class stack
{
private int MaxStack;
private int emptyStack;
public static int top;
private char[] items;

public stack(int i)
{
    // TODO Auto-generated constructor stub
}

public void Stack(int i)
{
    MaxStack=i;
    emptyStack=-1;
    top=emptyStack;
    items=new char[MaxStack];
}
public void Push( char c)
{

 items[top]=c;
 top++;
 System.out.println(item[top]);
 }
public char Pop(char c)
{

 return items[top--];
 }
public boolean full()
{

 return top+1==MaxStack;
 }
public boolean empty()
{
	return top== emptyStack;
}


public static void main(String[] args) throws IOException
{
    // TODO Auto-generated method stub
		stack ab=new stack(10);
        char ch;

while((ch= (char)System.in.read())!='\n')
{   

    if(!ab.full())
    {
        ab.Push(ch);
        }
        }
while(!ab.empty())
{
System.out.println(ab.Pop(ch));
System.out.println();
}
}
}