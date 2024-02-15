package assignment;

interface A3
{
	void a3();
}
interface A2
{
	void a2();
}
abstract class A1 implements A2, A3
{
	abstract void a1();
}

//Child Class
public class Assignment54 extends A1
{
	@Override
	public void a2() {
		System.out.println("a2");
	}

	@Override
	public void a3() {
		System.out.println("a3");
	}

	@Override
	void a1() {
		System.out.println("a1");
	}
public static void main(String[] args) {
	Assignment54 obj=new Assignment54();
	obj.a1();
	obj.a2();
	obj.a3();
}
}
