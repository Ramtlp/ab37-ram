package assignment;

public class Assignment81 {

	public static void main(String[] args)

	{

		String name = "Rahul123";
		char c[] = name.toCharArray();

		int digitcount = 0;
		int charcount = 0;
		for (int i = 0; i <= c.length - 1; i++) {
			boolean result = Character.isDigit(c[i]);
			if (result == true) {
				digitcount = digitcount + 1;
			} else {
				charcount = charcount + 1;
			}
		}
		System.out.println("Total digits are:" + digitcount);
		System.out.println("Total characters are:" + charcount);
	}
}
