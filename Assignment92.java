package assignment;
//Upcasting and downcasting Problem 4 as per Diagram during Class

class One
{
	static class one
	{
		
	}
	void methodone()
	{
		System.out.println("Method one");
	}
}

class Two extends One
{
	void methotwo()
	{
		System.out.println("Method two");
	}

}
class Three extends Two
{
	void methodthree()
	{
		System.out.println("Method three");
	}
}

class Four extends Three
{
	void methodfour()
	{
		System.out.println("Method four");
	}
}
public class Assignment92 
{
	void methodfive()
	{
		System.out.println("Method five");
	}
public static void main(String[] args) 
{
	//upcasting
	Two two=new Three();
	two.methodone();
	two.methotwo();
	//downcasting
	Three three=(Three)two;
	three.methodone();
	three.methotwo();
	three.methodthree();
	
	
}
}
