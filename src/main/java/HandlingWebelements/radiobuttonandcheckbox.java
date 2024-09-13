package HandlingWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobuttonandcheckbox {
	public static void main(String[] args) throws InterruptedException {
	
			WebDriverManager.chromedriver().setup();			
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			
			//radio button click
			driver.findElement(By.xpath("(//input[@name=\"radioButton\"])[1]")).click();
			Thread.sleep(1000);
			
			//isdisplayed
			boolean radioisdisp=driver.findElement(By.xpath("(//input[@name=\"radioButton\"])[1]")).isDisplayed();
			System.out.println(radioisdisp);
			
			//isenabled
			boolean radioisenab=driver.findElement(By.xpath("(//input[@name=\"radioButton\"])[1]")).isEnabled();
			System.out.println(radioisenab);
			
			//isselected for radiobutton
			boolean radioisselec=driver.findElement(By.xpath("(//input[@name=\"radioButton\"])[1]")).isSelected();
			System.out.println(radioisselec);
			
			
			//checkbox click			
			driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
			
			//isselected for checkbox
			boolean chkboxisselec=driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected();
			System.out.println(chkboxisselec);
			
	}
	

}
