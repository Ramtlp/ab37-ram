package assignment;

import java.util.Scanner;

public class Assignment62
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age:");
            int age = sc.nextInt();

            if (age >= 18)
            {
                System.out.println("You are allowed to access www.google.com");
            } 
            else 
            {
                throw new ArithmeticException("Access Denied: Age must be greater than 18");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
           
        } 
        finally {
            
            sc.close();
        }
    }
}
