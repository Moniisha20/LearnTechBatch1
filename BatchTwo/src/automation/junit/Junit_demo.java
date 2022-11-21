package automation.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Junit_demo {
	private static ChromeDriver driver ;
	WebElement element ;
//Java Unit Testing
// Jar needed: junit 4.12 , hamcrest core - 1.3
	@BeforeClass
	public static void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

}
	@AfterClass
	public static void quitBrowser()
	{
		driver.quit();
	}
	@Before
	public void StartTime()
	{
		System.out.println("Before");
	}
	@After
	public void EndTime()
	{
		System.out.println("After");
	}
	@Test
	public void test1()
	{
		driver.get("https://adactinhotelapp.com/");
		WebElement mail = driver.findElement(By.id("username"));
		mail.sendKeys("moniisha0220");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Iammoni@0220");
		
		Assert.assertEquals("moniisha0220", mail.getAttribute("value"));
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
	}
	//@Ignore
	@Test
	public void test2()
	{

		System.out.println("Test 2");
	}
}
