package HandlingWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


/*
 * dropdown can be selected by creating a object reference for select 
 * 3 ways:
 * 1) select by index
 * 2) select by value
 * 3) select by visible text
 */
public class dropdownselect {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();			
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select ref = new Select(dropdown);		
		
		  //select by index 
		  ref.selectByIndex(2);
		  Thread.sleep(1000);
		  
		  
		  //select by value 
		  ref.selectByValue("option3"); // see the value attribute how given option2 
		  Thread.sleep(1000);
		  
		  //select by visible text 
		  ref.selectByVisibleText("Option1");
		  Thread.sleep(1000); 
		 
		

/*
If there is no select tag then how will you click on the webelement? interview question
1) take the xpath of the dropdown webelement
2) take the xpath of the items inside the dropdown
3) use for loop and like dynamic parameterization passing of [i] index values, click() on the webelement which you want to select the items inside the dropdown
*/
		//get the webelements of all items in the dropdown - option
		// Loop to click all the items in list
		List<WebElement> elements = driver.findElements(By.xpath("//select[@id='dropdown-class-example']//option"));
				
		for (WebElement i: elements) {
			//dropdown.click();
			//Thread.sleep(1000);
			i.click();	
			Thread.sleep(2000);
			
		}
	}

}
