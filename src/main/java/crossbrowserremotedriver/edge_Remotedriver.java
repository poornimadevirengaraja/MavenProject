package crossbrowserremotedriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//https://www.youtube.com/watch?v=P5CLXIC7x5c
public class edge_Remotedriver {
	@Test
	public void edgeremotedriver() throws MalformedURLException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions Options= new EdgeOptions();
		//To run in incognito mode
		//Options.addArguments("--incognito");
		
		//for security purposes
		Options.addArguments("--no-sandbox");	
		
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
						
		Options.setCapability("browserName", "MicrosoftEdge");
		Options.setCapability("platformName", "Windows 11");
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), Options);
			driver.get("https://the-internet.herokuapp.com/");
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"from edge");
			driver.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}