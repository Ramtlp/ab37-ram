package assignment;

import java.util.Scanner;

public class Assignment1_27_11 
{
	public void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s1.nextInt();
		System.out.println("Enter value of b");
		int b=s1.nextInt();
		int sum=(a+b);
		System.out.println("Sum of a and b is:");
		System.out.println(sum);
	}
	
	public void sub()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s1.nextInt();
		System.out.println("Enter value of b");
		int b=s1.nextInt();
		int sub=(a-b);
		System.out.println("Subtraction of a and b is:");
		System.out.println(sub);
	}
	public void mul()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s1.nextInt();
		System.out.println("Enter value of b");
		int b=s1.nextInt();
		System.out.println("Product of a and b is:");
		int mul=(a*b);
		System.out.println(mul);
	}
	
	public void div()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s1.nextInt();
		System.out.println("Enter value of b");
		int b=s1.nextInt();
		int div=(a/b);
		System.out.println("Division of a and b is:");
		System.out.println(div);
	}
	
	
	
public static void main(String[] args)
{
	Assignment1_27_11 obj=new Assignment1_27_11();
	//Addition
//	obj.add();
//	obj.sub();
//	obj.mul();
	obj.div();
}
}
