package assignment;

import java.util.Scanner;

public class Assignment85 {
	public static void main(String[] args) {
		/*
		 * Declare 2 Strings and check if they are Equal
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.next();
		System.out.println("Enter second number");
		String str2 = sc.next();

		if (str1.equals(str2)) {
			System.out.println("Given string are equalt to each other");
		}

		else {
			System.out.println("Given string are not equal to eachother");
		}

		sc.close();

	}
}
