package HandlingWebelements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Handling multiple tabs opened


//what is DB windowhandle and Windowhandles?
//get.windowhandle(): This method helps to get the window handle of the current window. Its return type is String.
//get.windowhandles(): This method helps to get the handles of all the windows opened. Its return type is Set<String>.


public class Handlingwindowtabs {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();			
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		
		/*
		 * //using ArrayList ArrayList<String> tabs = new
		 * ArrayList<>(driver.getWindowHandles());
		 * driver.switchTo().window(tabs.get(0)); //parent window Thread.sleep(3000);
		 * driver.switchTo().window(tabs.get(1)); //child window Thread.sleep(3000);
		 * driver.close(); // closes the current tab of child window
		 */		 
		
		
		//using List
		/*
		 * List<String> tabs = new ArrayList<>(driver.getWindowHandles());
		 * driver.switchTo().window(tabs.get(0));//parent window Thread.sleep(3000);
		 * driver.switchTo().window(tabs.get(1));//child window Thread.sleep(3000);
		 * driver.close(); // closes the current tab of child window
		 */		
		
		
		//using Set
		String parentwindowid = driver.getWindowHandle();// parent window
		System.out.println(parentwindowid);
		
		Set<String> allwindowHandles = driver.getWindowHandles(); //all window handles		
		for( String handle :allwindowHandles) {
			if(!parentwindowid.equals(handle)){
			 	System.out.println(handle);
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("poornimadevi@gmail.com");
				Thread.sleep(3000);
				driver.close();
		}
		
		
		}
		
	}

}
