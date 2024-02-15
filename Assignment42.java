package assignment;

import java.util.Scanner;

public class Assignment42
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any case number");
	int a=sc.nextInt();
	switch (a) 
	{
	case 1: 
	{
		System.out.println("OK this is the case of Addition so now:");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter of value b");
		double b=sc.nextInt();
		System.out.println("Enter of value c");
		double c=sc.nextInt();
		System.out.println("Addition  of b and c:");
		System.out.println(b+c);
		sc1.close();
		break;
	}
	
	case 2: 
	{
		System.out.println("OK this is the case of Subtraction  so now:");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter of value b");
		double b=sc.nextInt();
		System.out.println("Enter of value c");
		double c=sc.nextInt();
		System.out.println("Subtraction  of b and c:");
		System.out.println(b-c);
		sc1.close();
		break;
	}
	
	case 3: 
	{
		System.out.println("OK this is the case of Multiplication  so now:");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter of value b");
		double b=sc.nextInt();
		System.out.println("Enter of value c");
		double c=sc.nextInt();
		System.out.println("Multiplication of b and c:");
		System.out.println(b*c);
		sc1.close();
		break;
	}
	case 4: 
	{
		System.out.println("OK this is the case of Division  so now:");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter of value b");
		double b=sc.nextInt();
		System.out.println("Enter of value c");
		double c=sc.nextInt();
		System.out.println("Substraction of b and c:");
		System.out.println(b/c);
		sc1.close();
		break;
	}
	default:System.out.println("Oops! Invalid Input.");
		
	}
	sc.close();
}
}
