package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {
	
					

	private void draganddrop() {
		
		//Actions Objname = new Actions(Webdriver_Referencename)
		//ActionMethods: dragAndDrop(); doubleClick() ; contextClick(); moveToElement();

		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
        Actions act=new Actions(driver);					
        WebElement src1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a[1]"));
        WebElement desc1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        act.dragAndDrop(From, To).build().perform();		
   //     act.dragAndDrop(src1, desc1).build().perform();
        act.clickAndHold(src1).moveToElement(desc1).release().build().perform();
	}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");

    try {
		
		Actions_Demo ac = new Actions_Demo();
		ac.draganddrop();
	} 
    catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}					

}
}
