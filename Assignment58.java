package assignment;


class Class_2
{
	public void m1() {
		System.out.println("public method");
	}
	
	private void m2()
	{
		System.out.println("private method");
	}
	
	protected void m3() {
		System.out.println("protected method");
	} 
	
	void m4()
	{
		System.out.println("default method");
	}
}
//Child Class
public class Assignment58 extends Class_2
{
	public static void main(String[] args) {
		Assignment58 ob=new Assignment58();
		ob.m1();
//		ob.m2(); //private not accessible outside the class within same package
		ob.m3();
		ob.m4();
	}
	
}
