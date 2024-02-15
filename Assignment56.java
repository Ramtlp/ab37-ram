package assignment;

interface I3
{
	void i3();
}
interface I2 extends I3
{
	void i2();
}
interface I1 extends I2
{
	void i1();
}
//Child Class
public class Assignment56 implements I1
{

	@Override
	public void i2() {
		System.out.println("i2");	
	}

	@Override
	public void i3() {
		System.out.println("i3");	
	}

	@Override
	public void i1() {
		System.out.println("i1");
	}
	public static void main(String[] args)
	{
		Assignment56 obj=new Assignment56();
		obj.i1();
		obj.i2();
		obj.i3();
	}
	
}
