package assignment;


class ParentClass2
{
	void selenium()
	{
		System.out.println("Selenium");
	}
	
	void java()
	{
		System.out.println("Java");
	}

}
public class Assignment44 extends ParentClass2
{
static void gk()
{
	System.out.println("GK");
}

public static void main(String[] args)

{
	gk();
	Assignment44 obj=new Assignment44();
	obj.selenium();
	obj.java();
}
}
