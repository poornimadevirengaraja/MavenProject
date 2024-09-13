package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//<suite name="Suite" parallel="methods" thread-count="4">
//It will run the methods in this test parallel, it will run 2 methods at a time parallel if thread count ="2"
// if thread-count ="4" then it will run 4 tests parallel
public class parallelmethodthreadcount {
	
	@Test(priority=1)
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		System.out.println("Test1");
		
	}

	@Test(priority=2)
	public void Test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");	
		System.out.println("Test2");
	}
		
	@Test(priority=3)
	public void Test3() {	
	WebDriverManager.chromedriver().setup();
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.flipkart.com/");
	System.out.println("Test3");
	}
	
	@Test(priority=4)
	public void Test4() {	
	WebDriverManager.chromedriver().setup();
	WebDriver dr=new ChromeDriver();
	dr.get("https://saucelabs.com/");
	System.out.println("Test4");
	}
}
