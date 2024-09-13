package Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends BaseClass{
	public POM() {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id = "user-name")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement username1;
	
	@FindBy(id = "password")
	public WebElement password;
	
	

}
