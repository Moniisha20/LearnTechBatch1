package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactin.com/HotelApp/index.php");
			driver.findElement(By.id("username")).sendKeys("moniisha0220");
			driver.findElement(By.id("password")).sendKeys("Iammoni@0220");
			WebDriverWait wait =new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login"))));
			driver.findElement(By.id("login")).click();
			
}
}
