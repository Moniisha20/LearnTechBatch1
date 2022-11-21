package automation.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickandalert {
public static void main(String[] args) throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	 driver= new ChromeDriver();
	 //Simple Alert - Ok button
	 //Confirmation Alert - Ok and Cancel Buttons
	 //Prompt Alert - Ok and Cancel button with text box
	 //Methods of Alert - accept(), dismiss()
driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();

//Double click the button to launch an alertbox
Actions action = new Actions(driver);
WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
action.doubleClick(link).perform();
//Switch to the alert box and click on OK button
//Thread.sleep(1000);
Alert alert = driver.switchTo().alert();
System.out.println("Alert Text\n" +alert.getText());
alert.accept();
//Closing the driver instance
driver.quit();

}
}
