package assignment;

public class Assinment_2 
{
	//Non static method
	public void age(int a)
	{
		System.out.println(a);
	}
	
	public void height(double a)
	{
		System.out.println(a);
	}
	
	//Non static method
	public static void letter(char a) 
	{
		System.out.println(a);
	}
	
	public static void bool(boolean a) 
	{
		System.out.println(a);
	}
	
	public static void name(String a) 
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("These are non static methods");
		//Calling non static methods
		
		Assinment_2 obj=new Assinment_2();
		
		obj.age(24);
		obj.height(5.6);
		
		
		
		
		
		System.out.println("These are static methods");
		//Calling static method
		letter('a');
		bool(true);
		name("Ram");
		
		
	}
}
