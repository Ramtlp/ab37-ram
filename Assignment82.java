package assignment;

import java.util.Scanner;

public class Assignment82
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
	System.out.println("Revers of the "+str+" is "+reverse);
	sc.close();
}
}
