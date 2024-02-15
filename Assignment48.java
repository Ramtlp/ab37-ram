package assignment;

class Test
{
	void add()
	{
		int a = 10, b = 30;
		System.out.println(a + b);
	}

	void sub() 
	{
		int a = 10, b = 30;
		System.out.println(a - b);

	}
}
abstract class AbstractClass extends Test
{
	abstract void multiplication();
	abstract void division();
}

public class Assignment48 extends AbstractClass
{
	void multiplication()
	{
		int a = 10, b = 30;
		System.out.println(a * b);
	}

	void division()
	{
		int a = 10, b = 30;
		System.out.println(a / b);
	}

	public static void main(String[] args)
	{
		Assignment48 obj = new Assignment48();
		obj.add();
		obj.sub();
		obj.multiplication();
		obj.division();

	}

}
