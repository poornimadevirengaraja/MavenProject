package waitpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
why to use wait statements ?
When a web page loads on a browser, various web elements (buttons, links, images) that someone wants to interact with may load at various intervals.
In automated testing, this causes some trouble when identifying certain elements. If an element is not located, then the “ElementNotVisibleException” appears. 
selenium Wait commands help resolve this issue.

1)Implicit Wait
2)Explicit Wait
3)Fluent Wait

thread.sleep(milliseconds) -> It is a java wait -> it is generally not recommended to use

Can we use both implicit wait and explicit wait in same script - No, Because it consumes time and wait time increases for each element
*/

public class implicitandexplicitwait {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//implicitlyWait
		//global wait
		//It should be given only once after the driver is initiated in a script
		//this wait is applicable for all elements in this script
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenum");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);
		
		//Explicit Wait
		//WebDriverWait
		WebDriverWait ewait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//here ExpectedConditions is a class with various method
		//It will check for the locator visibility of element in the page and if it is visible the it will become true and web element will be returned as output 
		WebElement element = ewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//span[text()='Selenium'])[1]")));
		element.click();
		
		/* You can use many expected conditions
		 * alertIsPresent() 
		 * elementSelectionStateToBe() 
		 * elementToBeClickable()
		 * elementToBeSelected()
		 */
		
		
		
	
	}

}
