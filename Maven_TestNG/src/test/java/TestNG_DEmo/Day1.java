package TestNG_DEmo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
//
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
public class Day1 {
  @Test
  public void test1() {
	  System.out.println("Test 1");
  }
  @Test
  public void test2()
  {
	System.out.println("Test 2");  
  }
  @BeforeSuite
  public void beforeSuite()
  {
	System.out.println("Before Suite");
  }
  @AfterSuite
  public void afterSuite()
  {
		System.out.println("After Suite");

  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeMethod
  public void beforeMethods()
  {
	  System.out.println("Before Method");
  }
  @AfterMethod
  public void afterMethods()
  {
	  System.out.println("After Method");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Before Test");
  }
  @AfterTest
  public void afterTest()
  {
	  System.out.println("After Test");
  }
}
