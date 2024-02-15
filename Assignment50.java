package assignment;

import java.util.Scanner;

interface Interface1 {
	void add();

	void sub();
}

interface Interface2 {
	void mul();

	void div();
}

public class Assignment50 /* child class */ implements Interface1, Interface2 {
	Scanner sc = new Scanner(System.in);
	public double num1;
	public double num2;

	@Override
	public void add() {
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
	}
	
	@Override
	public void sub() {
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));

	}
	
	
	@Override
	public void mul() {
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter first number");
		num2 = sc.nextInt();
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is:" + (num1 * num2));
	}

	@Override
	public void div() {
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		if (num2 != 0) {
			System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
		} else {
			System.out.println("Cannot divide by zero.");
		}
	}

	
	public static void main(String[] args)
	{
		Assignment50 ob = new Assignment50();
//		ob.mul();
		ob.div();
//		ob.add();
//		ob.sub();

	}

}
