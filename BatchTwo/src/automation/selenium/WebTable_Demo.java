package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Demo {
	public static void main(String[] args) throws Exception {
		//tr - Table row
		//th - Table heading
		//td - Table data
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	    String s = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText();
	    System.out.println(s);
	    if(s.equals("Google"))
	    {
	    	System.out.println("Printed value in table is:" + s);
	    }
	    else
	    {
	    	System.out.println("Recheck the value");
	    }
	}
	}
