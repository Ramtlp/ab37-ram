package assignment;

import java.util.HashSet;

//WAP on HashSet
public class Assignment103
{
public static void main(String[] args)
{
HashSet hs=new HashSet<>();
hs.add("Ram");
hs.add("Ram"); //Doesn't allow duplicate value
hs.add(5);
hs.add(1.6);
hs.add(true);
hs.add('c');
System.out.println(hs);
}
}
