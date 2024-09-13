package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//with static keyword used for webdriver dr
public class xpathparameterize1 {	
	
	/*As the webdriver is created in main static method and driver dr is used as local variable inside main,
	if you want to assign dr globally then you need to use 'static' word and make method1 also static .*/
	static WebDriver dr; 
	public static void method1(String id,String a) {	
		 System.out.println(a);
		 dr.findElement(By.xpath("//input[@id='"+id+"']")).sendKeys(a);
		 dr.findElement(By.xpath("//input[@id='"+id+"']")).clear();
	}
		
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		Thread.sleep(1000);		
		
		//parameterize the attribute name and attribute values
		//different username tried for the same username field
		method1("user-name","standard_user");		
		
		method1("user-name","locked_out_user");	
				
		method1("user-name","problem_user");
		
		method1("user-name","performance_glitch_user");

		
	}

}
