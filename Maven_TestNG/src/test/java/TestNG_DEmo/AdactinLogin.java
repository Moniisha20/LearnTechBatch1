package TestNG_DEmo;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import TestNG_DEmo.Data_Properties;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class AdactinLogin extends ExcelUtility {
	
	WebDriver driver ;
	public Properties prop ;
	public String dataSheetName , TestDataPath ;
	static ExtentTest test ;
	static ExtentReports report ;
	
	@BeforeSuite
	public void startTestModule()
	{
	
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_SS").format(new Date());
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String path1 = System.getProperty("user.dir")+"\\Reports\\ExtentReportResults"+timestamp+".html";
		System.out.println(path1);
		report = new ExtentReports(path1);
	}
	public static String screenshot_failed(String testCaseName, WebDriver driver) throws IOException
	{
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_SS").format(new Date());
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir")+"\\Reports\\FailedScreenshot"+timestamp+".html";
		FileUtils.copyFile(scrfile, new File(destfile));
		return destfile ;
	}
public ExtentTest startModule1(String TestCaseID)
{
	test = report.startTest(TestCaseID);
	return test ;
}
@BeforeMethod
public void beforeTest() {
	  dataSheetName = "Test";
	  TestDataPath = "./TestData";
	//  System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\BatchTwo\\Driver\\chromedriver.exe");
	  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
}

//@Test
//public void launchbrowser() throws IOException, InterruptedException
//{
//	
//	test=report.startTest("Launching Browser");
//	System.out.println("Browser launched successfully");
//	  prop = new Properties();
//		FileReader Reader = new FileReader("Properties\\Data.properties");
//		 prop.load(Reader);
//		 String url = prop.getProperty("url");
//		 String uname = prop.getProperty("username");
//		 String pwrd = prop.getProperty("password");
//		 driver.get(url);
//	
//}
//	
	
  @Test(dataProvider = "fetchData")
  public void login(String TestCaseID , String Description, String Username, String Password) throws Exception {
	try {
		
		test=report.startTest("Launching Browser");
		System.out.println("Browser launched successfully");
		  prop = new Properties();
			FileReader Reader = new FileReader("Properties\\Data.properties");
			 prop.load(Reader);
			 String url = prop.getProperty("url");
			 String uname = prop.getProperty("username");
			 String pwrd = prop.getProperty("password");
			 driver.get(url);
		
	  test = report.startTest(TestCaseID);
	
	 Locators l = new Locators(driver);
	 l.username().sendKeys(Username);
	 l.password().sendKeys(Password);
	 l.login().click();
	 
	 test.log(LogStatus.PASS, "Navigated to the specified URL");

  }
	catch(Exception e)
	{
		e.printStackTrace();
		test.log(LogStatus.FAIL, "Test Failed");
	}
  }
  

  @AfterTest
  public void close() {
	  report.flush();
	report.close();
	driver.close(); 


  }
  @AfterMethod
  public void tearDown(ITestResult result) throws Exception
  {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  test.log(LogStatus.FAIL, "TEST CASE FAILED : "+result.getName());
		  test.log(LogStatus.FAIL, "TEST CASE FAILED : " + result.getThrowable());
		  String screenshotPath = AdactinLogin.screenshot_failed(result.getName(), driver);
		  test.addScreenCapture(screenshotPath);
		  
	  }
	  else
	  {
		  test.log(LogStatus.PASS, "TEST CASE Passed :" + result.getName() );
	  }
	  report.endTest(test);
	  driver.close(); 
	  
}
  
  @DataProvider(name="fetchData")
  public String[][] getData()
  {
	  return ExcelUtility.readData();
  }
  

  
}
