package assignment;

import java.util.Arrays;

public class Assignment64
{
public static void main(String[] args) 
{
	String arr[]=new String[3];
	arr[0]="Manish";
	arr[1]="Rajat";
	arr[2]="Ajay";
	
	
	System.out.println("Array Before sorting:\n"+Arrays.toString(arr)+"\n");
	
	//Now sorting the array
	
	Arrays.sort(arr);
	
	System.out.println("Array after sorting:\n"+Arrays.toString(arr));
		
}
}
