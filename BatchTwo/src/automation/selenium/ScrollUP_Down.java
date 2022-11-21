package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUP_Down {

	//arguements[0].ScrollIntoView(true) - UP
	//arguements[0].ScrollIntoView(false) - down
	
	//JavaScriptExecutor: Interface
	//executeScript()- method
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		WebElement tamil = driver.findElement(By.xpath("//a[text() = 'தமிழ்']"));
		WebElement mail = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
	//	WebElement button = driver.findElement(By.xpath("//*[@id=\"u_0_9_0Y\"]"));
//TypeCAst - We are using Typecast to control one interface object
		//by another interface
//JavaScript Executor controls over webdriver object
//If webdriver need to be called again with its object, 
//we need to typecast once again,changing the control from js to webdriver
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", tamil);

		Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", mail);
        Thread.sleep(3000);
//Inserting the value
    
		js.executeScript("arguments[0].setAttribute('value','monisha')", mail);
		js.executeScript("arguments[0].setAttribute('value','hellopassword')", pass);
//Retrieving the value
		Object ob = js.executeScript("return arguments[0].getAttribute('value')", mail);
		String s = (String)ob;
		System.out.println("Your input valie is: "+ s);
	}
}
