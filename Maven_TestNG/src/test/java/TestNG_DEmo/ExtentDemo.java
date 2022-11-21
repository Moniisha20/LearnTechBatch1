package TestNG_DEmo;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.TakesScreenshot;
import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.OutputType;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentDemo {
static ExtentTest test;
static ExtentTest test1;

static ExtentReports report;
 WebDriver driver ;

@BeforeClass
public static void startTest()
{
report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
//test = report.startTest("ExtentDemo");
test1 = report.startTest("Gmail Launch", "Launching your browser");
}


@Test
public void extentReportsDemo() throws IOException
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
test = report.startTest("Google Launch");
driver.get("https://www.google.co.in");
if(driver.getTitle().equals("Google"))
{
test.log(LogStatus.INFO, "Loading Page");	
test.log(LogStatus.PASS, "Navigated to the specified URL");
test.log(LogStatus.PASS, test.addScreenCapture(screenshot_failed(driver))+"Test Passed");

}
else
{
test.log(LogStatus.FAIL, "Test Failed");
}
}


@Test
public void extentReportsDemo1() throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.gmail.co.in");
if(driver.getTitle().equals("Google"))
{
test1.log(LogStatus.PASS, "Navigated to the specified URL");
}
else
{
test1.log(LogStatus.WARNING, "Loading failed");
test1.log(LogStatus.FAIL, test1.addScreenCapture(screenshot_failed(driver))+"Test Failed");
}
}
public static String screenshot_failed(WebDriver driver) throws IOException
{
	File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destfile = new File("src/../images"+System.currentTimeMillis()+".png");
	String absolute_path = destfile.getAbsolutePath();
	FileUtils.copyFile(scrfile, destfile);
	return absolute_path ;
}

@AfterClass
public static void endTest()
{
report.endTest(test);
report.flush();
}
}
