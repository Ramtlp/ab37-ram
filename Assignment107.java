package assignment;

import java.util.Scanner;

//WAP for return keyword for float , double , string , boolen , using scanner class
public class Assignment107 
{
	 	static float add(float a, float b)
	 	{
	        return a + b;
	 	}

	    static double subtract(double a, double b) 
	    {
	        return a - b;
	    }

	    static String concatenate(String str1, String str2)
	    {
	        return str1 + str2;
	    }

	    static boolean logicalAND(boolean bool1, boolean bool2) 
	    {
	        return bool1 && bool2;
	    }

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        // Input for float
	        System.out.println("Enter values for float a and b:");
	        float f1 = sc.nextFloat();
	        float f2 = sc.nextFloat();
	        System.out.println("Sum of " + f1 + " and " + f2 + " is " + add(f1, f2));

	        // Input for double
	        System.out.println("Enter values for double a and b:");
	        double d1 = sc.nextDouble();
	        double d2 = sc.nextDouble();
	        System.out.println("Subtraction of " + d1 + " and " + d2 + " is " + subtract(d1, d2));

	        // Input for string
	        System.out.println("Enter values for string str1 and str2:");
	        String str1 = sc.next();
	        String str2 = sc.next();
	        System.out.println("Concatenation of '" + str1 + " and " + str2 + " is " + concatenate(str1, str2));

	        // Input for boolean
	        System.out.println("Enter values for boolean bool1 and bool2 (true/false):");
	        boolean bool1 = sc.nextBoolean();
	        boolean bool2 = sc.nextBoolean();
	        System.out.println("Logical AND of " + bool1 + " and " + bool2 + " is " + logicalAND(bool1, bool2));
	    }
}
