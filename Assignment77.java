package assignment;

import java.util.Arrays;

public class Assignment77
{

	public static void main(String[] args)
	{
		String arr1[]= {"Ram", "Shanker","Singh"};
		String arr2[]= {"Ram", "Shanker","Singh"};
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
