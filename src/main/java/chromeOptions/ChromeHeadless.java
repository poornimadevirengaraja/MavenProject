package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*Headless Browser is just like any other browser, with the only difference being that nothing is visible on the screen.
A headless browser is similar to a normal browser that performs functions such as navigating pages, clicking links, downloading content, and many more.
But, with a normal browser, you can check each step and proceed with the help of a GUI presentation. At the same time, you will use Command-line or Console Interface to keep track of changes.
*One clear advantage while using headless browsers is that they are faster than your typical browsers, as you can bypass all the time you take to load the CSS. 
*/
public class ChromeHeadless {
WebDriver driver;

@Test
public void verifyTitle() {
//WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
options.addArguments("headless");
driver=new ChromeDriver(options);
driver.get("https://www.browserstack.com/");
System.out.println("Title is: " +driver.getTitle());
Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
driver.quit();
}
}