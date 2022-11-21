package TestNG_DEmo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
WebDriver driver ;

public Locators(WebDriver driver)
{
	this.driver = driver ;
}


By uname = By.name("username");
By pswd = By.id("password");
By log = By.id("login");

public WebElement username()
{
	return driver.findElement(uname);
}

public WebElement password()
{
	return driver.findElement(pswd);
}

public WebElement login()
{
	return driver.findElement(log);
}
}

