package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//What is a Selenium WebElement? 
//A WebElement, in this case, a WebElement in Selenium is essentially an HTML element on a website. 
//HTML documents consist of HTML elements. Each HTML element consists of a start tag and an end tag.
//The content lies between the tags.

/*DB findelement and findelements ?
The methods findElements and findElement are used to identify elements on a webpage. 
While findElement can pinpoint only one element, the findElements method yields a list of matching web elements.
The return type of findElements is a list whereas the return type of findElement is a WebElement. 
If there is no matching element on the page, an exception is thrown by the findElement method.
In this scenario, an empty list id returned by the findElements method.*/

public class getalllinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://ultimateqa.com/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		//An HTML (Hypertext Markup Language) Page Source refers to the complete set of HTML code that constitutes a web page
		String pageSource = dr.getPageSource();
		System.out.println(pageSource);
		// get all links in webpage, that is the page visible to you currently and print it 
		// If you need to get all the links then scroll down each page and get it 
		// user ctrl+F then //a will show 107 links but current visible page is 78 links.You need to scroll down to get all the links
		List<WebElement> elements = dr.findElements(By.tagName("a"));
		int elementsize = elements.size();
		System.out.println(elementsize);
		for(int i=0;i<=elements.size()-1;i++) {
			String linkname=elements.get(i).getText();
			System.out.println(i+ "-" +linkname);
	
		}
		
		
	}

}

