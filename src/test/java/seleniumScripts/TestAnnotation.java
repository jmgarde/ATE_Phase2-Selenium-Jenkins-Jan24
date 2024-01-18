package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	// in order to execute below script written in the method use TestNG annotation
	// ** TestNG annotation will be always written above the Java method
	
	@Test
	public void createAccount()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("The title of the page is :" + driver.getTitle());
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
