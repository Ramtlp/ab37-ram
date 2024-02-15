package assignment;

import java.util.Scanner;

public class Assignment63 
{

	public static void main(String[] args)
	{
		int rollno[]=new int[5];
		for(int i=0;i<=4;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of index:"+i);
			rollno[i]=sc.nextInt();
		}
		
		System.out.println("Here are all the values");
		for(int i=0;i<=4;i++)
		{
			System.out.println(rollno[i]);
		}
	}	
}
