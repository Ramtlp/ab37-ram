package assignment;

import java.util.Scanner;

public class Assignment37 
{
//	WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as global variables
	Scanner sc = new Scanner(System.in);

	double a = sc.nextDouble();
	double b = sc.nextDouble();

	public void add() 
	{

		double sum = a + b;
		System.out.println("Ouput is:");
		System.out.println(sum);
	}

	public void sub() {

		double sub = a - b;
		System.out.println("Ouput is:");
		System.out.println(sub);
	}

	public void div() {
		
		double div = a / b;
		System.out.println("Ouput is:");
		System.out.println(div);
	}

	public void mul() {

		double mul = a * b;
		System.out.println("Ouput is:");
		System.out.println(mul);
	}

	public static void main(String[] args) 
	{
		Assignment37 obj = new Assignment37();
		
		System.out.println("Enter value first");
		
		System.out.println("Here you will se addition");
		obj.add();
		System.out.println("Here you will se subtraction");
		obj.sub();
		System.out.println("Here you will se multiplication");
		obj.mul();
		System.out.println("Here you will se divition");
		obj.div();
	}
}
