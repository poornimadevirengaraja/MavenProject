package Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// Page Factory
public class POM extends BaseClass{
	public POM() {
		PageFactory.initElements(driver, this);	
		//Page factory is a class in selenium web driver to initialize Page Object design pattern in selenium
		// IF you are not using this you will get null pointer exception
	}
	
	@FindBy(id = "user-name")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement username1;
	
	@FindBy(id = "password")
	public WebElement password;
	
	

}


