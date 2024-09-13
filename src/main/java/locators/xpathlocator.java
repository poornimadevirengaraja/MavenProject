package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathlocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		Thread.sleep(1000);

		/*
		 * //Basic Xpath - XPath expression select nodes or list of nodes on the basis
		 * of attributes like ID , Name, Classname, etc.
		 * dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user"
		 * );
		 * dr.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce"
		 * ); dr.findElement(By.xpath("//input[@id='login-button']")).click();
		 */

		/*
		 * //Contains - It is used when the value of any attribute changes dynamically.
		 * It has an ability to find the element with partial text.
		 * 
		 * dr.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys(
		 * "standard_user");
		 * dr.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys(
		 * "secret_sauce");
		 * dr.findElement(By.xpath("//input[contains(@id,'login')]")).click();
		 * Thread.sleep(1000);
		 * dr.findElement(By.xpath("//button[contains(@id,'menu-btn')]")).click();
		 * //contains and text() method to read text() or link text //a or paragraph
		 * text //p Thread.sleep(2000);
		 * dr.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		 * Thread.sleep(2000);
		 * dr.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		 */

		/*
		 * // using and & or
		 * dr.findElement(By.xpath("//input[@id='user-name' and @name='user-name']")).
		 * sendKeys("standard_user");
		 * dr.findElement(By.xpath("//input[@id='password' or  @name='password']")).
		 * sendKeys("secret_sauce");
		 * dr.findElement(By.xpath("//input[contains(@id,'login')]")).click();
		 */
		
		
		// If the name and id are dynamically changing elements then how will you automate? Then you have to use the tagname only here input which will not change and take by index
		dr.findElement(By.xpath("(//div[@class='form_group']//input[1])[1]")).sendKeys("standard_user");
		dr.findElement(By.xpath("(//div[@class='form_group']//input[1])[2]")).sendKeys("secret_sauce");
		dr.findElement(By.xpath("//input[contains(@id,'login')]")).click();
		
		
		Thread.sleep(3000);
		dr.quit(); // Quit the browser - It close entire browser
		// dr.close(); //Close the browser - It close the tab not entire browser

	}
}

/*
 * Xpath ? 1) XPath in Selenium is an XML path used for navigation through the
 * HTML structure of the page. 2) XPath can be used for both HTML and XML
 * documents to find the location of any element on a webpage using HTML DOM
 * structure. 3) In Selenium automation, if the elements are not found by the
 * general locators like id, class, name, etc. then XPath is used to find an
 * element on the web page.
 * 
 * syntax: ======= Xpath=//tagname[@attribute='value']
 * 
 * Types of xpath: =============== 1) Absolute xpath - It is the direct way of
 * finding the element from root node. If there any changes made in the path of
 * the element then xpath fails. Begins with (/).
 * /html/body/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/header/div[1]/a/img
 * 
 * 2) Relative xpath - It starts with middle of DOM structure. Begins with (//).
 * It is always preferred.
 * 
 * What is XPath axes? There are few axes methods commonly used in Selenium
 * Webdriver like child, parent, ancestor, sibling, preceding, self, etc. Axes
 * methods are used to find those elements, which dynamically change on refresh
 * or any other operations.
 * 
 * //div[@class='_2GaeWJ']//img[1]
 * 
 * //div[@class='I-qZ4M vLRlQb']//input[@classs='r4vIwl BV+Dqf']
 * 
 */
