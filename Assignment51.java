package assignment;

import java.util.Scanner;

interface InterfaceOne {
	void add();

	void sub();
}

abstract class AbstractClassOne implements InterfaceOne {
	Scanner sc = new Scanner(System.in);
	double a, b;

	abstract void mul();

	public void div() {
		System.out.println("Enter number First");
		a = sc.nextDouble();
		System.out.println("Enter number second");
		b = sc.nextDouble();
		if (b != 0) {
			System.out.println("Div of " + a + " & " + b + " is " + (a / b));
		} else {
			System.out.println("Zero can't divide by any number");
		}

	}
}

public class Assignment51 /* child class */ extends AbstractClassOne {

	double num1, num2;

	@Override
	public void add() {
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("Sum of " + num1 + " & " + num2 + " is " + (num1 + num2));
	}

	@Override
	public void sub() {
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("Sub of " + num1 + " & " + num2 + " is " + (num1 - num2));
	}

	@Override
	void mul() {
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("Multiplication of " + num1 + " & " + num2 + " is " + (num1 * num2));
	}

	public static void main(String[] args) {
		Assignment51 obj = new Assignment51();

//		obj.add();
//		obj.sub();
//		obj.mul();
		obj.div();
	}

}
