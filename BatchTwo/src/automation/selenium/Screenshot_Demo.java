package automation.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot_Demo {
	public void SeleniumTakeScreenShot() throws Exception{
//Interface - TakesScreenshot
//Method - getScreenshotAs
		//Screenshots are stored in the format temp.png by default name
	//Location - OutputType.FILE 
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://facebook.com/");

        //Call take screenshot function

        this.takeSnapShot(driver, "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Screenshots\\Test.png") ;     
    	driver.close();
    }

	private void takeSnapShot(WebDriver web, String fileWithPath) throws IOException {
		 TakesScreenshot scrShot =((TakesScreenshot)web);
//TakesScreenshotcontrols over webdriver object
	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);
		
	}

	
	public static void main(String[] args) throws Exception {
		Screenshot_Demo sc = new Screenshot_Demo();
		sc.SeleniumTakeScreenShot();
	}
}
