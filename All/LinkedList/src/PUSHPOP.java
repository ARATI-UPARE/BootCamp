class PUSHPOP
{
	private int MaxStack;
private int emptyStack;
public static int top;
private char[] items;

public SimpleStack(int i) {
    // TODO Auto-generated constructor stub
}

public void Stack(int i)
{
    MaxStack=i;
    emptyStack=-1;
    top=emptyStack;
    items=new char[MaxStack];
}
public void Push( char c){

 items[top]=c;
 top++;}
public char Pop(char c){

 return items[top--];}
public boolean full(){

 return top+1==MaxStack;}
public boolean empty(){
	return top== emptyStack;}}