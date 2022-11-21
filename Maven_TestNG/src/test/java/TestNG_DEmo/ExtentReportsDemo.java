package TestNG_DEmo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ExtentReportsDemo {
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
	
  @Test()
  public void login() {
	  ExtentTest test = extent.createTest("Launch Browser and Website");
	  test.log(Status.PASS, "Browser Launched successfully");
	  test.pass("Success Login");
  }

  @Test()
  public void hompage() {
	  ExtentTest test = extent.createTest("Home Page");
	  test.info("Displaying products");
	  test.pass("Home page scenario");

  }
  
  @Test(invocationCount = 10)
  public void searchcontext() {
	  ExtentTest test = extent.createTest("Search Content");
	  test.info("Searching the context");
	  test.warning("Product is loading");
	  test.log(Status.PASS, "Product Displayed");
	  test.pass("Products on screen");
	  
	  
  }
  
  @Test(invocationCount = 2)
  public void addtocart() {
	  ExtentTest test = extent.createTest("Added product");
	  test.info("Product is selected");
	  test.log(Status.PASS, "Product Displayed");
	  test.fail("Products on screen");
  }
 
 

  @BeforeTest(alwaysRun = true)
  public void beforeTest() {
		extent.attachReporter(spark);
		 spark.config().setTheme(Theme.STANDARD);
		 spark.config().setDocumentTitle("MyReport");



  }
  

  @AfterTest(alwaysRun = true)
  public void afterTest() {
	  extent.flush();
  }



}
