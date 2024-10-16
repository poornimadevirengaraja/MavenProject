package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorclass1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		
		// isDisplayed() - This method is used to verify the presence of any web elements on the web page. 
		Boolean ds=dr.findElement(By.id("user-name")).isDisplayed();
		System.out.println(ds);
		
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(2000);		
		dr.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);	
		dr.findElement(By.linkText("About")).click();
		Thread.sleep(5000);	
		//dr.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textDark MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-text MuiButton-textDark MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation css-zaj0tr"));
		Thread.sleep(2000);	
		
		// This will get the collection of all window in the sequential order
		Set<String> windowid=dr.getWindowHandles();
		for(String wid: windowid) {// looping through all windows using window id
			dr.switchTo().window(wid); // swithto window id
			if(dr.getTitle().equals("Sauce Labs | Accounts")) { // get tite of window and matching
				System.out.println(dr.getCurrentUrl());
				Thread.sleep(2000);	
				dr.findElement(By.name("callback_0")).sendKeys("standard_user");
				dr.findElement(By.name("callback_1")).sendKeys("secret_sauce");
				dr.findElement(By.className("checkmark")).click();
				dr.findElement(By.id("loginButton_0")).click();
				
			};
		}
		
		
	
		
		
		
				
	
		
	}

}
