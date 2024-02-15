package assignment;



interface C3
{
	void c3();
}

interface C2 extends C3
{
	void c2();
}
abstract class C1 implements C2
{
	abstract void c1();
}

//Child Class
public class Assignment55 extends C1
{
    @Override
	public void c2() {
		System.out.println("c2");
	}

	@Override
	public void c3() {
		System.out.println("c3");
	}

	@Override
	void c1() {
		System.out.println("c1");	
	}
	public static void main(String[] args) {
		Assignment55 ob=new Assignment55();
		ob.c1();
		ob.c2();
		ob.c3();
	}

}
