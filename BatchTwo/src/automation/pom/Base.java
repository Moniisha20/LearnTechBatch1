package automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
static WebDriver driver ;
public static WebDriver getDriver()
{			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
	
}

public static void loadUrl(String Url)
{
	driver.get(Url);
}
public void fill(WebElement element, String name)
{
	element.sendKeys(name);
}
public void btnClick(WebElement element)
{
	element.click();
}
}
