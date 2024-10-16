package waitpackage;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentwaitgeneralfn {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();		
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenum");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);
		
		//locator		
		By flocator=By.xpath("(//div//span[text()='Selenium'])[1]");
		fnfluentwaitelement(driver,flocator).click();
		
	}
	//Reusable Function fnfluentwaitelement where u can use different locators for fluent wait 
	private static WebElement fnfluentwaitelement(WebDriver driver, By locator) {
		Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) //methods - total time out is 30 seconds
				.pollingEvery(Duration.ofSeconds(5))//methods -For every 5 seconds it will check whether the element is visible till 30 seconds
				.ignoring(NoSuchElementException.class);//methods - it will ignore the no such element exception
		
		WebElement element = fwait.until(WebDriver ->driver.findElement(locator));	
		return element;
		
	}


}



