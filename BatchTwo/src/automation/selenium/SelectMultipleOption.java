package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOption {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();	
    String baseurl ="http://ironspider.ca/forms/dropdowns.htm";
    driver.get(baseurl);
    WebElement w = driver.findElement(By.name("coffee"));
   
    
    //Select_By_Index
    Select s=new Select(w);
    s.selectByIndex(2);
    Thread.sleep(3000);
    
    
    //2.selectByValue
    s.selectByValue("regular");
    Thread.sleep(3000);
    
    
    //3.selectByVisibletext:
    s.selectByVisibleText("With cream & sugar");
    Thread.sleep(3000);
   

   //isMultiple(): It is a method, used to check we can able to select multiple values or not
  
    boolean boo = s.isMultiple();
    System.out.println(boo);
    
//isMultiple(): It is a method, used to check we can able to select multiple values or not
    WebElement w1 = driver.findElement(By.name("coffee2"));
    Select s1=new Select(w1);
    boolean b = s1.isMultiple();
    System.out.println(b);
    
   //SelectByIndex:
    
    List<WebElement> web1 = s1.getOptions();
    for(int i=0;i<web1.size();i++){
    s1.selectByIndex(i);
}
    Thread.sleep(1000);
    
    //getAllSelectedOptions() -It is a method, used to print all selected options
    List<WebElement> web = s1.getAllSelectedOptions();
    for(WebElement x:web){
    System.out.println(x.getText());
    }
    
    //Deselect the options
    s1.deselectAll();
    Thread.sleep(1000);
    
    //2.selectByValue
    s1.selectByValue("skim");
    s1.selectByValue("whipped");
}
}
