package assignment;
//Create few constructor and call it in main method
public class Assignment8 

{
public  Assignment8()
{
	System.out.println("This constructor has non argument ");
}

public  Assignment8(String a)
{
	System.out.println(a);
}
public  Assignment8(char c)
{
	System.out.println(c);
}
public  Assignment8(int a, int b)
{
	int c=a+b;
	System.out.println("This construct adding a and b");
	System.out.println(c);
}
public static void main(String[] args) {
	new Assignment8();
	new Assignment8("This constructor has String type argument");
	new Assignment8("This constructor has char type argument");
	new Assignment8(10,20);
}
}
