package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class includeexcludegroups {
	
	@BeforeGroups(groups="fita")
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		System.out.println("BeforeGroups");
		
	}

	@Test(groups="fita")
	public void Test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");	
		System.out.println("Test2");
	}
	
	@Test(groups="fita")
	public void Test3() {
	System.out.println("Test3");	
	}
	
	@Test(groups="Regression")
	public void Test5() {
	System.out.println("Test5");	
	}
	
	@AfterGroups(groups="fita")
	public void Test4() {
	System.out.println("Test4");
	WebDriverManager.chromedriver().setup();
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.flipkart.com/");	
	
	}
}
