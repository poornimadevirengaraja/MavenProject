package javascriptexecutorpkg;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

/*JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver. 
 * JavaScriptExecutor provides two methods “executescript” & “executeAsyncScript” to run javascript on the selected window or current page.
 In case, these locators do not work you can use JavaScriptExecutor. You can use JavaScriptExecutor to perform an desired operation on a web element.

Selenium supports javaScriptExecutor. There is no need for an extra plugin or add-on.
 You just need to import (org.openqa.selenium.JavascriptExecutor) in the script as to use JavaScriptExecutor.
 */


public class javascriptexecutor1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement t=driver.findElement(By.linkText("Click Here"));
	
		//JavascriptExecutor is an interface 
		// WebDriver driver = new ChromeDriver(); As u are using web driver interface of driver iJavascriptExecutor needs to be type casted for driver. 
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", t);     // click on webelement

	}

}
