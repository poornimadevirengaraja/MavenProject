package HandlingWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// How to handle dynamic webtable ? - where rows and columns are keep changing and values inside the table also keep changing

/*
 * Static tables: Data is static i.e. Number of rows and columns are fixed.
   Dynamic tables: Data is dynamic i.e. Number of rows and columns are NOT fixed.
 */
public class webtableclass {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();			
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
	double a=0;
	
	//No of columns in the webtable
	//List<WebElement> elements1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	
	List<WebElement> elements1 = driver.findElements(By.xpath("//div//table[@class='dataTable']/thead/tr/th"));
	int colsize=elements1.size();
	System.out.println("Column size of webtable ="+colsize);
	
	//No of Rows in the webtable // in row tr td[1] is 26 is there
	//List<WebElement> elements2 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
	List<WebElement> elements2 = driver.findElements(By.xpath("//div//table[@class='dataTable']/tbody/tr"));
	int rowsize=elements2.size();
	System.out.println("Row size of webtable ="+rowsize);
	
	//get the 3rd row and 3nd cell data
	//WebElement element3 = driver.findElement(By.xpath("//*[@id='leftcontainer']//table//tbody/tr[3]/td[3]"));
	WebElement element3 = driver.findElement(By.xpath("//div//table[@class='dataTable']/tbody/tr[3]//td[3]"));
	System.out.println(element3.getText());
	
	//To find third row of table and prints the thrid row completely
	//WebElement tableRow = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
	WebElement tableRow = driver.findElement(By.xpath("//div//table[@class='dataTable']/tbody/tr[3]"));
	String rowtext = tableRow.getText();
	System.out.println("Third row of table : "+rowtext);
	
	// To find the maximum in the current price
	for( int i=1;i<=rowsize;i++) {
		String text2=driver.findElement(By.xpath("//div//table[@class='dataTable']/tbody/tr["+i+"]//td[4]")).getText();
		
		//String text2=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+(i)+"]/td[4]")).getText();
		double maxvalue = Double.parseDouble(text2);// Converting all prices to double
		System.out.println(maxvalue);
		if(maxvalue > a) {			
			a=maxvalue;			
		}
	}
	System.out.println("Maximum current price in the webtable ="+a);
	
}


}
