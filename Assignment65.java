package assignment;

import java.util.Arrays;

//Create an array of length 4 & copy its value to another array using iteration
public class Assignment65
{
public static void main(String[] args)
{
	String original[]=new String[4];
	original[0]="Value1";
	original[1]="Value2";
	original[2]="Value3";
	original[3]="Value4";
	
	String duplicate[]=new String[4];
	for(int i=0;i<=original.length-1;i++)
	{
		duplicate[i]=original[i];
	}
	
	System.out.println("Original array:"+Arrays.toString(original)+"\n");
	System.out.println("Duplicate array:"+Arrays.toString(duplicate));
}
}
