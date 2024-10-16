package waitpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitwaitgeneralfn {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenum");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);

		// locator and its will return by
		By elocator = By.xpath("(//div//span[text()='Selenium'])[1]"); // return type is By
		waitforElementfn(driver, elocator, 20).click(); // function call with 3 arguments

	}
	


	// This function can be used for many locators of web element
	// Create a reusable function waitforElementfn with 3 parameters driver, locator and timeout
	private static WebElement waitforElementfn(WebDriver driver, By locator, int timeout) {
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		WebElement element = ewait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;

	}

}
