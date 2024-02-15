package assignment;

import java.util.Date;

public class Assignment71 
{
public static void main(String[] args) 
{
	 Date currentDate = new Date();
	
	 // Get the epoch time in milliseconds
	 long epochTime = currentDate.getTime();
	
	// Create a new Date object using the epoch time
     Date newDate = new Date(epochTime);
     
     // Print the string representation of the new Date object
     System.out.println(newDate.toString());
     
     //Output:Mon Dec 25 22:24:09 IST 2023
     
     System.out.println("Day is "+newDate.toString().substring(0,3));
     
     System.out.println("Month is:"+newDate.toString().substring(4,7));
     
     System.out.println("Date is:"+newDate.toString().substring(8,10));
     
     System.out.println("Year is:"+newDate.toString().substring(24));
     
     
}
}
