package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown_Demo {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();					
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);
		WebElement cntry = driver.findElement(By.name("country"));
		Select drpCountry = new Select(cntry);
		drpCountry.selectByVisibleText("BELIZE");

	
}
}