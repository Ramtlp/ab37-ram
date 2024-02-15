package assignment;

/*
 "String = GroTechMinds
Output 1= All capital letters in String a
Output 2= All small letters in String b
and print both the strings"
 */
public class Assignment74
{
public static void main(String[] args)
{
	String str="GroTechMinds";
	String a=str.replaceAll("[a-z]", "");
	System.out.println("Output 1 is:"+a);
	
	String b=str.replaceAll("[A-Z]", "");
	System.out.println("Output 2 is:"+b);
}
}
