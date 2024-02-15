package assignment;

class X1
{
	void x1()
	{
		System.out.println("This is method x1");
	}
}

class X2 extends X1
{
	void x2()
	{
		System.out.println("This is method x2");
	}
}
public class Assignment90 extends X2
{

public static void main(String[] args) 
{
	//upcasting
	X1 x1obj=new Assignment90();
	x1obj.x1();
	
	//downcasting
	Assignment90 a89=(Assignment90)x1obj;
	a89.x1();
	a89.x2();
	
}

}
