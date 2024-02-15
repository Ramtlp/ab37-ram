package assignment;

import java.util.Scanner;

/*
 Create an array of length 4 of int data type. 
 Find out 41 is present or not in array. 
 Print message in both the cases.
 */
public class Assignment75
{
	public static void main(String[] args)
	{
		int number[] = {20, 30,50,42};
		int temp = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int search = sc.nextInt();
		
		for (int i =0; i<= number.length - 1; i++)
		{
			if (search == number[i]) {
				System.out.println(number[i] + ":is present in the index:"+i);
				temp++;
			}

		}
		if (temp == 0)
		{
			System.out.println(search+":is not present in the index");
		}

	}
}

