package assignment;

interface InterfaceOne_1 {
	void interfaceone();
}

interface InterfaceTwo_2 {
	void interfacetwo();
}

interface InterfaceThree3 {
	void interfacethree();
}

interface InterfaceFour4 {
	void interfacefour();
}

public class Assignment53 implements InterfaceOne_1, InterfaceTwo_2, InterfaceThree3, InterfaceFour4 {

	@Override
	public void interfacefour()
	{
		System.out.println("1");

	}

	@Override
	public void interfacethree()
	{

		System.out.println("2");
	}

	@Override
	public void interfacetwo()
	{

		System.out.println("3");
	}

	@Override
	public void interfaceone()
	{
		System.out.println("4");

	}
	
	public static void main(String[] args)
	{
		Assignment53 obj=new Assignment53();
		obj.interfaceone();
		obj.interfacetwo();
		obj.interfacethree();
		obj.interfacefour();
	}

}
