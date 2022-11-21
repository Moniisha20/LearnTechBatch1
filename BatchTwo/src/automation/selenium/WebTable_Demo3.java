package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Demo3 {
	public static void main(String[] args) throws Exception {
		//tr - Table row
		//th - Table heading
		//td - Table data
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for(int i=0;i<=tRows.size();i++)
		{
			List<WebElement> tData = driver.findElements(By.tagName("td"));
			for(int j=0;j<=tData.size();j++)
			{
				System.out.println(tData.get(j).getText());
			String cname = tData.get(j).getText() ;
			if(cname.equals("China"))
			{
			System.out.println(tData.get(j).getText());
			System.out.println("Row no:" + i);
			System.out.println("Coulumn no: " + j);
			}
		
			
			}
			
	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
