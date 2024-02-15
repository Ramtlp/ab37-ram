package assignment;
//WAP to use getter and setter with int, char, boolean, string, float, double 
public class Assignment96 
{
	private int myInt=96;
	private char myChar='R';
	private boolean myBoolean=true;
	private String myString="Ram";
	private float myFloat=11.12f;
	private double myDouble=20.36d;
	
public int getMyInt() 
{
	return myInt;
}
public void setMyInt(int myInt)
{
	this.myInt = myInt;
}
public char getMyChar()
{
	return myChar;
}
public void setMyChar(char myChar) 
{
	this.myChar = myChar;
}
public boolean isMyBoolean() 
{
	return myBoolean;
}
public void setMyBoolean(boolean myBoolean)
{
	this.myBoolean = myBoolean;
}
public boolean getMyBoolean()
{
	return myBoolean;
}
public String getMyString() 
{
	return myString;
}
public void setMyString(String myString)
{
	this.myString = myString;
}
public float getMyFloat() 
{
	return myFloat;
}
public void setMyFloat(float myFloat) 
{
	this.myFloat = myFloat;
}
public double getMyDouble()
{
	return myDouble;
}
public void setMyDouble(double myDouble) 
{
	this.myDouble = myDouble;
}

public static void main(String[] args)
{
	Assignment96 ob=new Assignment96();
	System.out.println("Calling int:");
	ob.setMyInt(97);
	System.out.println("Updated value of int is:"+ob.getMyInt());
	
	System.out.println("Calling char");
	ob.setMyChar('A');
	System.out.println("Updated value of char is:"+ob.getMyChar());
	
	System.out.println("Calling boolean");
	ob.setMyBoolean(false);
	System.out.println("Updated value of boolean is:"+ob.getMyBoolean());
	
	System.out.println("Calling String");
	ob.setMyString("Shanker");
	System.out.println("Updated value of String is:"+ob.getMyString());
	
	System.out.println("Calling float");
	ob.setMyFloat(1.23f);
	System.out.println("Updated value of float is:"+ob.getMyFloat());
	
	System.out.println("Calling double");
	ob.setMyDouble(5.145d);
	System.out.println("Updated value of double is:"+ob.getMyDouble());

	
}
}
