package assignment;
//WAP to update the value of private variable username = "abc@grotechmind.com" 
//to something else using getter and setter



class  AnyParent
{
	private String Username = "abc@grotechmind.com";

	public String getUsername() // this is getter method
	{
		return Username;// fetched the value
	}

	public void setUsername(String Username)// setter method
	{
		this.Username = Username;
	}

}
public class Assignment95 extends AnyParent
{
public static void main(String[] args)
	
	{
	AnyParent a1 = new AnyParent();
		a1.setUsername("ram@gmail.com");
		System.out.println("This is the updated user name:"+a1.getUsername());
	}
}
