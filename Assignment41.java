package assignment;

import java.util.Scanner;

public class Assignment41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = sc.nextInt();

		switch (a)
		{
		case 1: {

			int x = 12;
			int y = 10;
			System.out.println("Addition of given number is:");
			System.out.println(x + y);
			break;

		}
		case 2: {
			
			int x = 12;
			int y = 10;
			System.out.println("Substraction of given numbers is: ");
			System.out.println(x - y);
			break;

		}
		case 3: {
			int x = 12;
			int y = 10;
			System.out.println("Multiplication of given numbers is: ");
			System.out.println(x - y);
			break;

		}

		case 4: {
			int x = 12;
			int y = 10;
			System.out.println("Division of given numbers is: ");
			System.out.println(x - y);
			break;

		}
		default:System.out.println("Invalid input");
		}
	}
}
