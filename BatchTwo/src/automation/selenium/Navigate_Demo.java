package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://adactinhotelapp.com/");
	Thread.sleep(2000);
	//To navigate to previous page
	driver.navigate().back();
	Thread.sleep(2000);
	//To navigate to next page
	driver.navigate().forward();
	Thread.sleep(2000);
	WebElement mail = driver.findElement(By.id("username"));
	mail.sendKeys("moniisha0220");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("Iammoni@0220");
	
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	Thread.sleep(2000);
	//Refresh current web page
	driver.navigate().refresh();
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Adactin.com - Search Hotel"))
	{
		System.out.println("You have entered into the website");
	}
	else
	{
		System.out.println("Recheck your login details");
	}
	driver.quit();
}
}
