package automation.selenium;
import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Robots_Demo {
	public static void main(String[] args) throws AWTException, InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();	
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/upload/");
       
        String path="C:\\Users\\monishs\\Desktop\\LearnTech\\Selenium\\Dummy.txt";
        System.out.println("Windows openend");
       System.out.println("ID found");
       WebDriverWait wait =new WebDriverWait(driver, 60);
       wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"))));
    //   choosefile.sendKeys(path);
       WebElement choosefile = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));

      choosefile.click();
        System.out.println("File CLicked");
        Thread.sleep(2000);
       /* Robot robot = new Robot();
        robot.setAutoDelay(3000);
        StringSelection selection = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard()
        .setContents(selection, null);
        // press ctrl+vsss
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.setAutoDelay(3000);
        // release ctrl+v
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        // press enter
        robot.setAutoDelay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/
  }	
}
