package assignment;

public class CL12_Assignment1
{
	static int a;
	static int b;
public static void  add() 
{
	a=100;
	b=200;
	int c=a+b;
	System.out.println("Below is add");
	System.out.println(c);
}
public static void  sub() 
{
	a=100;
	b=200;
	int c=a-b;
	System.out.println("Below is sub");
	System.out.println(c);
}

public static void main(String[] args) {
	add();
	sub();
}
}
