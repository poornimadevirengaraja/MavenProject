package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * pseudo classes
 * ============
 * :first-child
 * :last-child
 * :nth-child
 * :nth-last-child
 * 
 * Based on type or tag selected
 * ==============================
 * :first-of-type
 * :last-of-type
 * :nth-of-type(index)
 */
public class cssselectors2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		boolean eq1 = dr.findElement(By.cssSelector("a>button[class='btn btn-primary']:nth-child(1)")).getText().equals("Home");
		System.out.println(eq1);
		
		boolean eq2 = dr.findElement(By.cssSelector("button[class='btn btn-primary']:nth-child(2)")).getText().equals("Practice");
		System.out.println(eq2);
		
		
		boolean eq3 = dr.findElement(By.cssSelector("button[class='btn btn-primary']:nth-child(3)")).getText().equals("Login");
		System.out.println(eq3);
		
		
		boolean eq4 = dr.findElement(By.cssSelector("button[class='btn btn-primary']:nth-child(4)")).getText().equals("Signup");
		System.out.println(eq4);
		
		String eq5 = dr.findElement(By.cssSelector("a>button[class='btn btn-primary']:first-child")).getText();
		System.out.println(eq5);
		
		String eq6= dr.findElement(By.cssSelector("button[class='btn btn-primary']:nth-last-child(1)")).getText();
		System.out.println(eq6);
		
		String eq7= dr.findElement(By.cssSelector("div#radio-btn-example>fieldset>label:first-of-type")).getText();
		System.out.println(eq7);
		
		String eq8= dr.findElement(By.cssSelector("div#radio-btn-example>fieldset>label:last-of-type")).getText();
		System.out.println(eq8);
		
		String eq9= dr.findElement(By.cssSelector("div#radio-btn-example>fieldset>label:nth-of-type(2)")).getText();
		System.out.println(eq9);
		
	}

}
