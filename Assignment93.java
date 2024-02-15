package assignment;
//Upcasting and downcasting Problem 5 as per Diagram during Class


class Question5_04
{
	 void question5_04() 
	{
		System.out.println("Method name question5_04 of class Question5_04");

	}
}
class Question5_03 extends Question5_04
{
	 void question5_03() 
		{
			System.out.println("Method name question5_03 of class Question5_03");

		}
}
class Question5_02 extends Question5_03
{
	 void question5_02() 
		{
			System.out.println("Method name question5_02 of class Question5_02");

		}
}
public class Assignment93 extends Question5_02
{

	public static void main(String[] args) 
	{
		//upcasting of  Question5_02
		Question5_03 obj_Q3=new Question5_02();
		obj_Q3.question5_04();
		obj_Q3.question5_03();
		
		//downcasitng of class Question5_02 with Assignment93
//		upcasting
		Question5_02 obj_02=new Assignment93();
		//downcasting
		Assignment93 obj_01	=(Assignment93)obj_02;
		obj_01.question5_04();
		obj_01.question5_03();
		obj_01.question5_02();
		
	}
}
