package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment84 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string first");
		String s1 = sc.next(); 
		System.out.println("Enter string second");
		String s2 = sc.next(); 

		if (s1.length() != s2.length())
		{
			System.out.println("Given strings are not Anagram");
		}

		else {
			char[] c1 = s1.toCharArray(); 
			Arrays.sort(c1); 

			char[] c2 = s2.toCharArray();
			Arrays.sort(c2);
			boolean result = Arrays.equals(c1, c2);
			if (result == true) {
				System.out.println("Given Strings are Anagram");
			}

		}
		sc.close();
	}
}
