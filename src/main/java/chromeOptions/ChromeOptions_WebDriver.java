package chromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/*The Chromeoptions Class is a concept in Selenium WebDriver for manipulating various properties of the Chrome driver. 
The Chrome options class is generally used in conjunction with Desired Capabilities for customizing Chrome driver sessions. It helps you perform various operations like opening Chrome in maximized mode, 
disable existing extensions, disable pop-ups, etc.

https://peter.sh/experiments/chromium-command-line-switches/
*/

public class ChromeOptions_WebDriver {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions Options= new ChromeOptions();
	
	//To run in incognito mode
	//Options.addArguments("--incognito");
	
	//To run with maximized window mode
	//Options.addArguments("start-maximized");
	
	//To do headless browser mode
	//Options.addArguments("--headless");
	//Options.addArguments("--disable-gpu);
	
	//To add new extensions in chrome
	//Options.addExtensions(new File("/Path/to/extension.crx"));
	
	//To add binary path if it throws any binary exception
	//Options.setBinary(new File("/Path/to/Chrome"));
	
	//To accept untrusted SSSL certificate
	Options.setAcceptInsecureCerts(true);
	
	//To disable info-bar 
	//Options.addArguments("disabe-infobars");
	
	
	// To block Block dialog windows
	//Options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
	
	//To remove the Automation pop up 
	Options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
	
	// TO change the window size
	//Options.addArguments("window-size=400,600");
	
	//To set capability
	Options.setCapability("browserVersion", "120");
	Options.setCapability("platformName", "Windows");
	
	WebDriver driver=new ChromeDriver(Options);
	driver.get("https://the-internet.herokuapp.com/");
	//To change the window size
	//driver.manage().window().setSize(new Dimension(500,700));
	System.out.println(driver.getTitle()+"from chrome");
}
}