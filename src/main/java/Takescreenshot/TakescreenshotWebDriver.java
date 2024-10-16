package Takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakescreenshotWebDriver {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		/*  if u are using WebDriver Interface here , then you need to type cast TakesScreenshot interface to driver
		Because WebDriver is an interface and TakesScreenshot is also interface which does not have driver.
		suppose, if you are using ChromeDriver driver = new ChromeDriver(); then no need to typecast TakesScreenshot interface to driver.
		Because chromedriver is a remote driver class which includes TakesScreenshot interface
		*/
		//File name for Take screenshot
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s"); // put MM for month otherwise it will print minutes
        Date date = new Date();
        
		// screen shot of whole page
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File(".\\Screenshots\\"+dateFormat.format(date)+".png");
		FileUtils.copyFile(srcfile, destfile);
		
		// selected feature or a section or an element in a page 
		WebElement element = driver.findElement(By.xpath("//img[@alt='Featured Destination: Aruba']"));
		File srcfile1=element.getScreenshotAs(OutputType.FILE);
		File destfile1=new File(".\\Screenshots\\"+dateFormat.format(date)+".png");
		FileUtils.copyFile(srcfile1, destfile1);
		
		
	}
}
