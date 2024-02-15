package assignment;

import java.util.Scanner;

public class Assignment39
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your age");
	int age=sc.nextInt();
	
	if(age>=18)
	{
		System.out.println("I am an adult");
	}
	else
	{
		System.out.println("I am young");
	}
}
}
