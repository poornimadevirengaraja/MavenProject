package javascriptexecutorpkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplearguments {
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();	
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	String script = "return arguments[0] + arguments[1];"; 
	Object result = js.executeScript(script, 5, 10); 
	System.out.println(result); // Outputs: 15 
}
}