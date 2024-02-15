package assignment;

class ParentClass {
	void selenium()
	{
		System.out.println("Selenium");

	}

	void java()
	{
		System.out.println("Java");

	}

	void gk()
	{
		System.out.println("GK");

	}
}

public class Assignment43 extends ParentClass
{
	void childClassmethod()
	{
		
		System.out.println("This is child class method");
	}
public static void main(String[] args) 
{
	Assignment43 obj=new Assignment43();
	obj.childClassmethod();
	obj.selenium();
	obj.java();
	obj.gk();
}
}
