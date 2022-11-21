package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Launch {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	//Thread.sleep(10000);
	String title = driver.getTitle();
	System.out.println(title);
	String cu = driver.getCurrentUrl();
	System.out.println(cu);
	//WebElement mail = driver.findElement(By.id("email"));
	WebElement mail = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	mail.sendKeys("monihsa");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("iagvjhf");
	
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
//	driver.quit();
	
}
}
