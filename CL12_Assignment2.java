package assignment;

public class CL12_Assignment2 
{
	int a = 100;
	int b = 200;
	int sum = a + b;
	int sub = a - b;

	public static void add() 
	{
		CL12_Assignment2 obj = new CL12_Assignment2();
		System.out.println(obj.sum);

	}

	public static void sub() 
	{
		CL12_Assignment2 obj = new CL12_Assignment2();
		System.out.println(obj.sub);
	}

	public static void main(String[] args) 
	{
		System.out.println("This is add");
		add();
		System.out.println("This is sub");
		sub();
	}
}
