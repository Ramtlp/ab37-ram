package assignment;

public class Assignment5 
{

	public void non_staticMethod() 
	{
		System.out.println("This is non-static method");
	}
	public static void main(String[] args)
	{
		Assignment5 object=new Assignment5();
		object.non_staticMethod();
	}
}
