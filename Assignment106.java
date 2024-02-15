package assignment;
//WAP for return keyword for int and double
public class Assignment106 
{
	static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	static double subtract(double a,double b)
	{
		double sub=a-b;
		return sub;
	}
public static void main(String[] args) 
{
	int sum=add(5,6);
	System.out.println("Sum is:"+sum);
	double sub=subtract(75.36, 36.36);
	System.out.println("Sub is:"+sub);
}
}
