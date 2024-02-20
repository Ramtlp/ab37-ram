package scrollUpanddown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment149:Scroll down on youtube for infinite times
public class Assignment149
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		
		JavascriptExecutor jse=driver;
		for(int i=1000;i>=1000;i++) 
		{
		jse.executeScript("window.scrollBy(0,"+i+")");
		Thread.sleep(i);
		}
	}
}
