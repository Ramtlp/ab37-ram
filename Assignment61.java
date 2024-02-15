package assignment;
//"WAP to handle below 2 exceptions by using 2 catch blocks

//Scanner s1= new Scanner
//int c = 1/0;
//int a = s1.nextint();"

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter number");
			int c = s1.nextInt();
			System.out.println((c/0));

		} 
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception: Division by zero");
		}

		catch (InputMismatchException e)
		{
			System.out.println("InputMismatch Exception: Please enter a valid integer");
		}
	}
}
