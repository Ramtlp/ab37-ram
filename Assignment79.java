package assignment;

public class Assignment79 
{
public static void main(String[] args)
{
	String name="Ram321";
	char c[]=name.toCharArray();
	for(int i=0;i<=c.length-1;i++)
	{
		boolean result=	Character.isDigit(c[i]);
		
		if(result==true)
		{
			System.out.println(c[i]+" is Digit");
		}
		
		else
		{
			System.out.println(c[i]+" is Character");
		}
	}
}
}
