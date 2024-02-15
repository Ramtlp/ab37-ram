package assignment;

interface Amazon
{
	void login();
	void logout();
}

class ChildClass implements Amazon
{

	@Override
	public void login()
	{
		
		System.out.println("This is login");
	}

	@Override
	public void logout()
	{
		
		System.out.println("This is logout");
	}
	

}
public class Assignment49 extends ChildClass
{
 public static void main(String[] args) {
	 Assignment49 ob=new Assignment49();
	 ob.login();
	 ob.logout();
}
}
