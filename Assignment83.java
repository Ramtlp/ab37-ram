package assignment;

import java.util.Scanner;

public class Assignment83 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=sc.next(); 
		char[] ch=str.toCharArray();
		String reverse="";
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse=reverse+ch[i];
		}
		
		sc.close();
		
		if(str.equals(reverse))
		{
			System.out.println("Given string is Pallindrome");
		}
		
		else {
			System.out.println("Given string is not Pallindrome");
		}
	}
	
	
}
