package locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//what is DB windowhandle and Windowhandles?
//get.windowhandle(): This method helps to get the window handle of the current window. Its return type is String.
//get.windowhandles(): This method helps to get the handles of all the windows opened. Its return type is Set<String>.

public class locatorclass2windowhandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://ultimateqa.com/");
		dr.manage().window().maximize();
		//dr.findElement(By.linkText("SCHEDULE A FREE DISCOVERY SESSION")).click();
		dr.findElement(By.partialLinkText("SCHEDULE A FREE")).click();
		Thread.sleep(10000);
		
		String parentWindow = dr.getWindowHandle(); // This method helps to get the window handle of the current window
		Set<String> wid=dr.getWindowHandles();		
		Iterator<String> itr = wid.iterator();//Looping through windows using window id, iterator iterates over iterator java collection framework and iterator() returns the value 
		while(itr.hasNext()) { 
			String childwindow=itr.next();
			dr.switchTo().window(childwindow);	// swith to() window
			// get tite of window and matching
			if(dr.getTitle().contains("Push Higher Quality")){ 
				System.out.println(dr.getCurrentUrl());
				dr.close();
				Thread.sleep(2000);				
			}
		
		}
		
		//switch to parent window and close it
		dr.switchTo().window(parentWindow);	
		dr.close();	
		
	}

}
