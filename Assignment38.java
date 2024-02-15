package assignment;

import java.util.Scanner;

public class Assignment38
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of triangle");
		double h=sc.nextDouble();
		System.out.println("Enter the base of triangle");
		double b=sc.nextDouble();
		
		double area=0.5*(h*b);
		System.out.println("Area of the triangle is:");
		System.out.println(area);
	}

}
