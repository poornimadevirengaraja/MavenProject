package crossbrowserremotedriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//https://www.youtube.com/watch?v=P5CLXIC7x5c
public class Internetexplorer_Remotedriver {
	@Test
	public void InternetExplorerremotedriver() throws MalformedURLException, InterruptedException {
		WebDriverManager.iedriver().setup();
		InternetExplorerOptions Options= new InternetExplorerOptions();
			
		Options.setCapability("browserName", "internet explorer");
		Options.setCapability("platformName", "Windows 11");
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), Options);
			driver.get("https://the-internet.herokuapp.com/");
			Thread.sleep(5000);
			System.out.println(driver.getCurrentUrl()+"from ie");
			driver.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}