package assignment;

import java.util.Scanner;

/*
Create an array of length 4 of int data type 
and find out average of those numbers and remainder of those
*/
public class Assignment66
{
public static void main(String[] args)
{
	int arr[]=new int[4];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	arr[0]=sc.nextInt();
	System.out.println("Enter second number");
	arr[1]=sc.nextInt();
	System.out.println("Enter third number");
	arr[2]=sc.nextInt();
	System.out.println("Enter fourth number");
	arr[3]=sc.nextInt();
	
	double sum=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum=sum+arr[i];
	}
	
	double average=sum/arr.length;
	System.out.println("Average of the given numbers:"+average);
	
}
}
