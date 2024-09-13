package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// with out static keyword used for webdriver dr
public class xpathparameterize2 {	
	
	// here Webdriver is globally assigned variable and so 'static Webdriver dr' is not necessary here
	// method1 also is not static here
	WebDriver dr; 
	public void method1(String id,String a) {	
		 System.out.println(a);
		 dr.findElement(By.xpath("//input[@id='"+id+"']")).sendKeys(a);
		 dr.findElement(By.xpath("//input[@id='"+id+"']")).clear();
	}
		
	
	public static void main(String[] args) throws InterruptedException {
		
		xpathparameterize2 refdr=new xpathparameterize2();// object for class is created here so that you can use this object to refer all the webdrivers used in main method as webdriver is declared globally.
		
		WebDriverManager.chromedriver().setup();
		refdr.dr=new ChromeDriver();
		refdr.dr.get("https://www.saucedemo.com/");
		refdr.dr.manage().window().maximize();
		Thread.sleep(1000);			
		refdr.method1("user-name","standard_user");	
		
		refdr.method1("user-name","locked_out_user");	
				
		refdr.method1("user-name","problem_user");
		
		refdr.method1("user-name","performance_glitch_user");
		 
		
	}

}
