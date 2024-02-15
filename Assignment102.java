package assignment;

import java.util.TreeSet;

public class Assignment102 
{
public static void main(String[] args)
{
	 TreeSet ts = new TreeSet();
	ts.add("Ram");
	ts.add("Ram");
	ts.add("ram");//Doesn't allow duplicate
	ts.add("Deepak");
//	ts.add(3);
//	ts.add('c');
//	ts.add(true);

	System.out.println(ts);
}
}
