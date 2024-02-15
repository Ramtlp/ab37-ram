package assignment;

import java.util.Arrays;

public class Assignment78
{
public static void main(String[] args)
{
	int arr1[]= {15,20,63,89};
	int arr2[]= {15,20,63,89};
	boolean result=Arrays.equals(arr1, arr2);
	
	if(result==true)
	{
		System.out.println("Given arrays are similar");
	}
	
	else 
	{
		System.out.println("Given arrays are not similar");
	}	
}
}
