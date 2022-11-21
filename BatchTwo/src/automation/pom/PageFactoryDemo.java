package automation.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryDemo extends Base{
	
	public PageFactoryDemo()
	{
		PageFactory.initElements(driver, this);

	}

	@FindBy(id="username")
	private WebElement name;

	@FindBy(id = "password")
	private WebElement password ;

	@FindBy(id = "login")
	private WebElement login ;

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
