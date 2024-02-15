package assignment;

import java.util.Scanner;

public class Assignment36 {
//Use all the methods of scanner class

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(str);

		System.out.println("Enter the Integer value");
		int i = sc.nextInt();
		System.out.println(i);

		System.out.println("Enter the byte");
		byte byte1 = sc.nextByte();
		System.out.println(byte1);

		System.out.println("Enter the value of short");
		short short1 = sc.nextShort();
		System.out.println(short1);

		System.out.println("Enter the value of long");
		long l = sc.nextLong();
		System.out.println(l);

		System.out.println("Enter the value of float");
		float f = sc.nextFloat();
		System.out.println(f);

		System.out.println("Enter the value of double");
		double d = sc.nextDouble();
		System.out.println(d);

		System.out.println("Enter the value of Boolean");
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		System.out.println("Enter the value of char data type");
		char c=sc.next().charAt(0);

	}

}
