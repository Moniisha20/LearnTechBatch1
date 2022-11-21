package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();					

    driver.get("http://demo.guru99.com/test/radio.html");					
    WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
    WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
    		
    //Radio Button1 is selected		
    radio1.click();			
    System.out.println("Radio Button Option 1 Selected");					
    		Thread.sleep(1000);
    //Radio Button1 is de-selected and Radio Button2 is selected		
    radio2.click();			
    System.out.println("Radio Button Option 2 Selected");					
	Thread.sleep(1000);

    // Selecting CheckBox		
    WebElement option1 = driver.findElement(By.id("vfb-6-0"));							
    WebElement option2 = driver.findElement(By.xpath("//input[@value='checkbox2']"));
    // This will Toggle the Check box 		
    option1.click();
   			

    // Check whether the Check box is toggled on 	
    if (option1.isSelected()) {					
        System.out.println("Checkbox one is Toggled On");					

    } else {			
        System.out.println("Checkbox one is Toggled Off");					
    }		
    if (option2.isSelected()) {					
        System.out.println("Checkbox two is Toggled On");					

    } else {			
        System.out.println("Checkbox two is Toggled Off");					
    }		
     

}
}
