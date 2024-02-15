package assignment;

import java.util.Scanner;

//Convert your Age from byte to short:
public class Assignment87 {
	 public static void main(String[] args) 
	 {
	        System.out.println("Enter your byte  age:");
	        Scanner sc = new Scanner(System.in);
	        byte myByteage=sc.nextByte();
	        System.out.println("My byte age is:"+myByteage);
	        
	        short myShortage=myByteage;
	        System.out.println("My short age is:"+myShortage);

	    }
}
