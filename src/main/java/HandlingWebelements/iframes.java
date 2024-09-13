package HandlingWebelements;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframes {
	@Test
	public static void method1(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//driver.switchTo().frame(frame);
		//or
		//driver.switchTo().frame("iframeResult");
		//or
	    driver.switchTo().frame(1);   //index starts from 0 so second frame is 1

	        
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
	}

}
