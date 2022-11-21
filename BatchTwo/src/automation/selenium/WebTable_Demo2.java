package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Demo2 {
	public static void main(String[] args) throws Exception {
		//tr - Table row
		//th - Table heading
		//td - Table data
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for(WebElement rows:tRows)
		{
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		for(WebElement data:tData)
		{
		System.out.println(data.getText());
		}
		}
	}
	}