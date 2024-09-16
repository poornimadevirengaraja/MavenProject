package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * What is a CSS Selector?
CSS Selectors in Selenium are string patterns used to identify an element based on a combination of HTML tag, id, class, and attributes.

only forward you can move but faster than xpath
mostly xpath is used because if any value changes it will not work 
syntax :
========
Tag and ID  -> input#email -> here # means id
Tag and class  -> input.inputtext  -> here dot means class
Tag and attribute ->  input[type='text']  -> no need to use double slash before input or @ sign before the attribute type
Tag, class, and attribute  -> input.inputtext[type='text']
Inner text ->  font:contains

Demo site:
==========
https://demo.guru99.com/test/facebook.html
https://rahulshettyacademy.com/AutomationPractice/
 */
public class cssselector1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/test/facebook.html");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("input#email")).sendKeys("poornimadevi@gmail.com");
		dr.findElement(By.cssSelector("input.inputtext[tabindex='2']")).sendKeys("123456");
		dr.findElement(By.cssSelector("input[value='Log In']")).click();
		dr.quit();
		
	}

}
