package Takescreenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshotusingchromedriver {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		/*  if u are using WebDriver Interface here , then you need to type cast TakesScreenshot interface to driver
		Because WebDriver is an interface and TakesScreenshot is also interface which does not have driver.
		suppose, if you are using ChromeDriver driver = new ChromeDriver(); then no need to typecast TakesScreenshot interface to driver.
		Because chromedriver is a remote driver class which includes TakesScreenshot interface
		*/
		
		// To take screen shot and store in different random file names png 
		String filname=RandomStringUtils.randomAlphanumeric(3);
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot ts = driver;		
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File(".\\Screenshots\\"+filname+".png");
		FileUtils.copyFile(srcfile, destfile);
		
		
	}
}
