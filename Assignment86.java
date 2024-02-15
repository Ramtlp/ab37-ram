package assignment;

import java.util.Scanner;

public class Assignment86
{
//	Question:Convert Weight from int to double and from double to int
	public static void main(String[] args) {

		System.out.println("Enter your weight in int data type:");
		Scanner sc = new Scanner(System.in);
		int weight1 = sc.nextInt();
		double weight2 = weight1;
		System.out.println("Your weight is in double: " + weight2);
		int weight3 = (int) weight2;
		System.out.println("Again your weight is in int: " + weight3);
		sc.close();
	}
}
