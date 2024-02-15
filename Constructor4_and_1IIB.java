package assignment;

public class Constructor4_and_1IIB {
	
	public Constructor4_and_1IIB(String a)
	{
		System.out.println("Cosntructor1");
	}

	public Constructor4_and_1IIB(String a, String b) 
	{
		System.out.println("Cosntructor2");
	}

	public Constructor4_and_1IIB(int a) {
		System.out.println("Cosntructor3");
	}

	public Constructor4_and_1IIB(char c) 
	{
		System.out.println("Cosntructor4");
	}

	// IIB
	{
		System.out.println("This is SIB");
	}

	public static void main(String[] args) 
	{
		new Constructor4_and_1IIB("a");
		new Constructor4_and_1IIB("a","b");
		new Constructor4_and_1IIB(5);
		new Constructor4_and_1IIB('a');
	}
}
