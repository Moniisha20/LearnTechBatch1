package automation.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFLocal extends Base{
public PFLocal()
{
	PageFactory.initElements(driver, this);

}

@FindBy(id="username")
private WebElement name;

@FindBy(id = "password")
private WebElement password ;

@FindBy(id = "login")
private WebElement login ;
//Generate Getters and Setters for the above private methods. 
//So that they can be accessible in other classes.
//RightClick->Source->Generate Getters and Setters

public WebElement getName() {
	return name;
}

public void setName(WebElement name) {
	this.name = name;
}

public WebElement getPassword() {
	return password;
}

public void setPassword(WebElement password) {
	this.password = password;
}

public WebElement getLogin() {
	return login;
}

public void setLogin(WebElement login) {
	this.login = login;
}


}
