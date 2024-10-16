package HandlingWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicwebtablegetallvalues {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();			
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/table.html");
	driver.manage().window().maximize();
	
	// Find the total number of rows in this webtable
	
	List<WebElement> elements = driver.findElements(By.xpath("//table//tbody//tr"));
	//List<WebElement> elements = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
	int rowsize = elements.size();
	System.out.println("Total Table Rows size ="+rowsize);
	
	// for loop through each row and find the total number of columns in each row
	// then read the values of all columns in each row
	
	for(int i=1;i<=rowsize;i++) {
		List<WebElement> elements2 = driver.findElements(By.xpath("//table//tbody//tr["+i+"]//td"));
		//List<WebElement> elements2 = driver.findElements(By.xpath("/html/body/table/tbody/tr["+i+"]/td"));
		int colsize = elements2.size();
		System.out.println("Row No "+ i+" & Column size ="+ colsize);
		
		for (int j=1;j<=colsize;j++) {
			
			WebElement element = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+j+"]"));
			System.out.println("Row ="+i+" Column ="+j+" Value ="+element.getText());
		
			
		}
	}
	
}
}
