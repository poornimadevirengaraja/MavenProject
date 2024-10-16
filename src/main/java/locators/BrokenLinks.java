package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class BrokenLinks {


public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://bstackdemo.com/");
driver.manage().window().maximize();
Thread.sleep(2000);


// Finding all the available links on webpage
List<WebElement> links = driver.findElements(By.tagName("a"));


// Iterating each link and checking the response status
for (WebElement link : links) {
String url = link.getAttribute("href");
verifyLink(url);
}


driver.quit();
}

// if response code is not 200 or if response code is 404 then it is broken links
public static void verifyLink(String url) {
	try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();

		if (httpURLConnection.getResponseCode() == 200) {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
	} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
	}
}
}