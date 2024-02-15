package assignment;

public class Assignment80 
{
public static void main(String[] args)
{
	String name="Ram123";
	char[] c=name.toCharArray();//{R,a,m,1,2,3} lenght=6-1
	for(int i=0;i<=c.length-1;i++)//i=0
	{
		boolean result=Character.isDigit(c[i]);//c[0]
		
		if(result==true)
		{
			System.out.println("Indexing of "+c[i]+" is "+i);
		}
		else
		{
			System.out.println("Indexing of "+c[i]+" is "+i);
		}
	}
}
}
