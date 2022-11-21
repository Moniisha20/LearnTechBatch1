package automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Local extends Base {
public static void main(String[] args) {
	getDriver();
	loadUrl("https://adactinhotelapp.com/");
	Base b = new Base();
	WebElement element = driver.findElement(By.id("username"));
	b.fill(element, "moniisha0220");
	WebElement element1 = driver.findElement(By.id("password"));
	b.fill(element1, "Iammoni@0220");
	WebElement login = driver.findElement(By.id("login"));
	b.btnClick(login);
}
}
