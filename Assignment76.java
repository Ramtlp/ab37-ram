package assignment;

public class Assignment76 
{

	public static void main(String[] args)
	{
		int number[] = {20, 30,50,41};
		int temp = 0;
		System.out.println("Enter the number");
		int search = 41;
		
		for (int i =0; i<= number.length - 1; i++)
		{
			if (search == number[i]) {
				System.out.println("Index of "+search+" is "+i);
				temp++;
			}

		}
		if (temp == 0)
		{
			System.out.println(search+":is not present in the index");
		}

	}
}
