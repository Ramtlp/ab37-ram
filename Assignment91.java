package assignment;

//Upcasting and downcasting Problem 3 as per Diagram during Class

class C4
{
	void methodofC()
	{
		System.out.println("Method of C");
	}
}

class D extends C4
{
	void methodofD()
	{
		System.out.println("Method of D");
	}
}
public class Assignment91 extends D
{
	void assignment()
	{
		System.out.println("assignment90 method");
	}
public static void main(String[] args) 
{
	//upcasting
	D d=new Assignment91();
	d.methodofC();
	d.methodofD();
	//downcasting
	Assignment91 as90=(Assignment91)d;
	as90.methodofC();
	as90.methodofD();
	as90.assignment();
}
}
