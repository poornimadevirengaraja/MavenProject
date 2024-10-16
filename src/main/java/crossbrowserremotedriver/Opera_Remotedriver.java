package crossbrowserremotedriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.opera.OperaOptions;

// selenium 4 Opera options are deprecated You need to install older version of selenium less than 4 to work with opera driver
//https://www.youtube.com/watch?v=P5CLXIC7x5c

/*public class Opera_Remotedriver {
	@Test
	public void chromeremotedriver() throws MalformedURLException {
		WebDriverManager.operadriver().setup();
		OperaOptions chromeOptions= new OperaOptions();
		chromeOptions.setCapability("browserName", "opera");
		chromeOptions.setCapability("platformName", "Windows 11");
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), OperaOptions);
			driver.get("https://the-internet.herokuapp.com/");
			System.out.println(driver.getTitle()+"from chrome");
			//driver.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}*/