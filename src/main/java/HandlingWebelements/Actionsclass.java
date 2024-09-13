package HandlingWebelements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; // import actions class

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

//.build().perform() - here perform() is mandatory for all actions
public class Actionsclass {
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * //Example-1 WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("http://demo.guru99.com/test/newtours/");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * Actions act = new Actions(driver); // pass the driver to Actions class
		 * 
		 * //move to element - mouse hover WebElement element1 =
		 * driver.findElement(By.linkText("Flights"));
		 * act.moveToElement(element1).perform(); Thread.sleep(2000);
		 */
		
		
		
		
		/*//Example-2
		 * //Right Click WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 * driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * Actions act = new Actions(driver); // pass the driver to Actions class
		 * 
		 * //right click on the element WebElement element2 =
		 * driver.findElement(By.xpath("//span[text()='right click me']"));
		 * act.contextClick(element2).perform(); Thread.sleep(2000);
		 * 
		 * //click on Edit in right click me
		 * driver.findElement(By.xpath("//span[text()='Edit']")).click();
		 * Thread.sleep(2000);
		 * 
		 * // alert (ok) button click (yes) driver.switchTo().alert().accept();
		 * 
		 * //dismiss the alert (No) //driver.switchTo().alert().dismiss();
		 * Thread.sleep(2000);
		 * 
		 * //double click WebElement element3 =
		 * driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"
		 * )); act.doubleClick(element3).perform(); Thread.sleep(2000);
		 * 
		 * // alert (ok) button click (yes) driver.switchTo().alert().accept();
		 * 
		 * //dismiss the alert (No) //driver.switchTo().alert().dismiss();
		 * Thread.sleep(2000);
		 */
		
		
		
		/*
		 * //Example-3 //drag and drop WebDriverManager.chromedriver().setup();
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://demo.guru99.com/test/drag_drop.html");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * Actions act = new Actions(driver); // pass the driver to Actions class
		 * 
		 * WebElement dragelement =
		 * driver.findElement(By.xpath("(//li[@id='fourth'])[1]")); WebElement
		 * dropelement = driver.findElement(By.xpath("//ol[@id='amt7']"));
		 * act.dragAndDrop(dragelement, dropelement).perform(); Thread.sleep(2000);
		 */
				
		
		//Example-4
		//keyboard Actions - key up and keydown
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 
		 Actions act = new Actions(driver); // pass the driver to Actions class
		 WebElement element5 = driver.findElement(By.id("email"));
		 
		 //SHIFT + fita ( uppercase FITA will be typed in email id field)
		 act.moveToElement(element5).click()
		 .keyDown(element5, Keys.SHIFT)
		 .sendKeys(element5,"fita")
		 .keyUp(element5, Keys.SHIFT)
		 .perform();		 
		 Thread.sleep(3000);
		 
		 
		 //ctrl+Z 
		 act.keyDown(element5, Keys.CONTROL)
		 .sendKeys(element5,"z")
		 .keyUp(element5, Keys.CONTROL)
		 .perform();
		 Thread.sleep(3000);
		 
				
	}

}
