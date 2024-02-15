package assignment;
//6.Write many non static method and call it inside the main method
public class Assignment6 
{
	public void non_static1() 
	{
		System.out.println("This is non static method 1");
	}

	public void non_static2() 
	{
		System.out.println("This is non static method 2");
	}

	public  void non_static3() 
	{
		System.out.println("This is non static method 3");
	}

	public  void non_static4() 
	{
		System.out.println("This is non static method 4");
	}
	public static void main(String[] args) 
	{
		
		Assignment6 object=new Assignment6();
		object.non_static1();
		object.non_static2();
		object.non_static3();
		object.non_static3();
		
	}
}
