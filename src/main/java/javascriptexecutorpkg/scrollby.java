package javascriptexecutorpkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class scrollby {

	public static void main(String[] args) throws InterruptedException {

		{
			WebDriver driver = new ChromeDriver();

			// Creating the JavascriptExecutor interface object by Type casting
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Launching the Site.
			driver.get("http://moneyboats.com/");
			// Maximize window
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(5000);
			// Vertical scroll down by 800 pixels			
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(5000);
			// Vertical scroll down up 600 pixels	
			js.executeScript("window.scrollBy(0,-600)");
		}
	}
}