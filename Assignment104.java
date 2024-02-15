package assignment;

import java.util.LinkedHashSet;

//WAP on LinkedHashSet
public class Assignment104 
{
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("Ram");
	lhs.add("Ram"); //Doesn't allow duplicate value
	lhs.add(5);
	lhs.add(1.6);
	lhs.add(true);
	lhs.add('c');
	System.out.println(lhs);
	
}
}
