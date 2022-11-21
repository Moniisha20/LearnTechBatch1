package automation.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingMultipleTabs {

    public static void main(String[] args) throws InterruptedException, AWTException {
        // TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        String url="https://www.lambdatest.com/";
        String  username= "sadhvisingh24"; // Your LambdaTest Username
        String auth_key = "abcdefghi123456789"; // Your LambdaTest Access Key
        String URL= "@hub.lambdatest.com/wd/hub"; //This is the hub URL for LambdaTest
        
       
        
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            
            //Navigating to airbnb
            driver.get("https://www.lambdatest.com");
            
            driver.manage().window().maximize();
            
            String currentHandle= driver.getWindowHandle();
            
            //locating the blog url
            String urlToClick=driver.findElement(By.xpath("//a[text()='Blog']")).getAttribute("href");
            
            
            //opening the new tab
            ((JavascriptExecutor)driver).executeScript("window.open()");
            
            //getting all the handles currently availabe
            Set<String> handles=driver.getWindowHandles();
            for(String actual: handles)
            {
                
             if(!actual.equalsIgnoreCase(currentHandle))
             {
                 //switching to the opened tab
                 driver.switchTo().window(actual);
                 
                 //opening the URL saved.
                 driver.get(urlToClick);
             }
            }
        driver.quit();
     
    }
    }

