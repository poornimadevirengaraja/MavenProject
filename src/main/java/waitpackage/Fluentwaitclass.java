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

/* Fluent Wait
1) It will ignore NoSuchElementException till total time out given in the script
2) Polling time - For every 5 seconds it will check whether the element is visible till 30 seconds
*/

public class Fluentwaitclass {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//we are declaring a fluent wait with the timeout of 30 seconds and the frequency is set to 5 seconds by ignoring “NoSuchElementException“
		// Here Wait<WebDriver> is interface and FluentWait<>class
		// Thus this means that it will check for the element on the web page at every 5 seconds for the maximum time of 30 seconds. If the element is located within this time frame it will perform the operations else it will throw an “ElementNotVisibleException“
		Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) //methods - total time out is 30 seconds
				.pollingEvery(Duration.ofSeconds(5))//methods -For every 5 seconds it will check whether the element is visible till 30 seconds
				.ignoring(NoSuchElementException.class);//methods - it will ignore the no such element exception
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenum");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);
		
		WebElement element = fwait.until(WebDriver ->driver.findElement(By.xpath("(//div//span[text()='Selenium'])[1]")));
		element.click();
	}

}
