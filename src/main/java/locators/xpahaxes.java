package locators;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpahaxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		/*
		 * //child and following axes method
		 * dr.findElement(By.xpath("(//*[@class='form_group']//child::input)[1]")).
		 * sendKeys("standard_user"); // any node of class='form_group' as parent and
		 * its immediate child of index 1 of 2
		 * dr.findElement(By.xpath("(//*[@class='form_group']//child::input)[2]")).
		 * sendKeys("secret_sauce"); // any node of class='form_group' as parent and its
		 * immediate child of index 2 of 2
		 * dr.findElement(By.xpath("//*[@class='form_group']//following::input[2]")).
		 * click(); // any node of class Thread.sleep(1000);
		 */
		
		//preceding axes method
		dr.findElement(By.xpath("(//*[@type='submit']//preceding::input)[1]")).sendKeys("standard_user"); // any node of type='submit' as parent and its previous nodes of input tag of index 1 of 2 
		dr.findElement(By.xpath("(//*[@type='submit']//preceding::input)[2]")).sendKeys("secret_sauce"); //any node of type='submit' as parent and its previous nodes of input tag of index 2 of 2
		
		Thread.sleep(1000);
		
		//following-sibling
		int siblingsize=dr.findElements(By.xpath("//div[@id='login_credentials']//following-sibling::br")).size(); // from any parent node of class = login_credentials following siblings of same child variety of br is total 6
		System.out.println("siblingsize ="+siblingsize);
		
		
		//ancestor - The ancestor axis selects all ancestors element (grandparent, parent, etc.) of the current node
		int ancestorsize=dr.findElements(By.xpath("//*[@class='form_group']//ancestor::div")).size();
		System.out.println("ancestorsize ="+ancestorsize);
		
		
		//Descendant -  Selects the descendants 'div' of the current node of @class='login-box'
		int decendentsize=dr.findElements(By.xpath("//*[@class='login-box']//descendant::div")).size();
		System.out.println("decendentsize ="+decendentsize);
		
		
		dr.findElement(By.xpath("//*[@type='submit']")).click(); // any node of class
		Thread.sleep(1000);
		
		//parent - Selects the parent tag of the current node
		String str=dr.findElement(By.xpath("//span[contains(text(),'Products')]//parent::div")).getAttribute("data-test");
		System.out.println(str);
		
	
		
		// First method of getting price webelement from this webpage
		// get the size of the price webelements in this page which is 6 
		int size=dr.findElements(By.xpath("(//*[@class='inventory_item_price'])")).size();
		System.out.println(size);
		// Loop 1 to 6 and print all the prices in this page
		for(int i=1;i<=size;i++) {
		String price=dr.findElement(By.xpath("(//*[@class='inventory_item_price'])["+i+"]")).getText();
		System.out.println(price);
		
		}
		//or
		
		// Second method of getting price webelement from this webpage
		
		  List<WebElement> elements = dr.findElements(By.xpath("(//*[@class='inventory_item_price'])"));
		  System.out.println(elements.size()); 
		  for(WebElement s:elements) { System.out.println(s.getText()); }
		 
		  // sort the prices in ascending order 
		  
		  // sort the prices in descending order
		
		  
		  // 
		
		

	}

}

/* 
//*[@class='form_group']//following::input[2] - It will go to one node following to similar node name @class='form_group'
//*[@class='form_group']//child::input[2] - It will go to one node next inside to parent node @class='form_group' which is child node
(//*[@class='form_group'])//following::input[2]
 */


