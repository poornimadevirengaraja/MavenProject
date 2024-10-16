package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 static WebDriver  driver;
	
	public static void chromeopen() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);

}
}

//driver manage maximize and options interface in selenium
/*
* driver. manage() is a method that returns instance of options interface, now
* the options interface has method window() that returns instance of window
* interface, this window interface has method maximize() which maximizes the
* window.
*/