package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class includeexcludemethods {
	@Test
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		System.out.println("Test1");
		
	}
	
	@Test
	public void Test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");	
		System.out.println("Test2");
	}
	
	@Test
	public void Test3() {
	System.out.println("Test3");	
	}
	
	@Test
	public void Test4() {
	System.out.println("Test4");	
	}
	
}
