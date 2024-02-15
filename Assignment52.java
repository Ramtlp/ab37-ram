package assignment;

interface InterfaceOne1
{
	void interfaceone();
}

interface InterfaceTwo2 {
	void interfacetwo();
}

public class Assignment52 implements InterfaceOne1, InterfaceTwo2 {

	@Override
	public void interfacetwo() {
		System.out.println("This is second interface method");
	}

	@Override
	public void interfaceone() {
		System.out.println("This is first interface method");
	}

	public static void main(String[] args) {
		Assignment52 ob = new Assignment52();
		ob.interfaceone();
		ob.interfacetwo();
	}

}
