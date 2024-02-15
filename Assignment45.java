package assignment;

class A 
{
	void a()
	{
		System.out.println("Method a");
	}
}

class B extends A 
{
	void b()
	{
		System.out.println("Method a");
	}
}

class C extends B
{
	void c()
	{
		System.out.println("Method a");
	}
}

public class Assignment45 extends C
{
public static void main(String[] args)
{
	Assignment45 obj=new Assignment45();
	obj.a();
	obj.b();
	obj.c();
}
}
